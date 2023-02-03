package com.techeule.examples.avro;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techeule.examples.avro.schemas.Order;

class AvroToBytesSerializerDeserializerTest {

    private static final AvroToBytesSerializerDeserializer<Order> orderAvroSerializerDeSerializer = new AvroToBytesSerializerDeserializer<>(Order.class);

    @Test
    void serializeTest() {
        final var order = new Order(UUID.randomUUID().toString(), UUID.randomUUID().toString(), Instant.now().getEpochSecond());

        final var bytes = orderAvroSerializerDeSerializer.serialize(List.of(order));

        assertThat(bytes).contains(order.getSchema().toString().getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytes, StandardCharsets.UTF_8));
    }

    @Test
    void deserializeTest() {
        final var order1 = new Order(UUID.randomUUID().toString(),
                                     UUID.randomUUID().toString(),
                                     Instant.now().getEpochSecond());
        final var order2 = new Order(UUID.randomUUID().toString(),
                                     UUID.randomUUID().toString(),
                                     Instant.now().plusSeconds(120)
                                            .getEpochSecond());

        final var bytes = orderAvroSerializerDeSerializer.serialize(List.of(order1, order2));
        final var deserializedOrders = orderAvroSerializerDeSerializer.deserialize(bytes);

        assertThat(deserializedOrders).hasSize(2);
        assertDeserializedOrder(order1, deserializedOrders.get(0));
        assertDeserializedOrder(order2, deserializedOrders.get(1));
    }

    private static void assertDeserializedOrder(final Order expectedOrder,
                                                final Order actualOrder) {
        assertThat(expectedOrder).isNotSameAs(actualOrder);
        assertThat(expectedOrder.getOrderId()).isEqualTo(actualOrder.getOrderId());
        assertThat(expectedOrder.getCustomerId()).isEqualTo(actualOrder.getCustomerId());
        assertThat(expectedOrder.getOrderDateEpochSecondsUTC()).isEqualTo(actualOrder.getOrderDateEpochSecondsUTC());
    }
}