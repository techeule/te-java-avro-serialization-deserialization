# Apache Avro Serialization and Deserialization java example used on [TechEule.com](https://techeule.com/)

> All provided paths in this file are relative to the root-folder
> of this git-repository.

In this blog post [https://techeule.com/posts/Simple-Java-Avro-Serializer-Deserializer/](https://techeule.com/posts/Simple-Java-Avro-Serializer-Deserializer/)
you can find more info about this repository.

## Code

The main logic can be found in the class:
[`src/main/java/com/techeule/examples/avro/AvroToBytesSerializerDeserializer.java`](./src/main/java/com/techeule/examples/avro/AvroToBytesSerializerDeserializer.java)

The Avro-Schemas are located at:
[`src/main/resources/avro-schemas/`](./src/main/resources/avro-schemas)

**Note**
> First, you have to compile this project using maven because
> the `Order`-class is generated from the AVRO-Schema at
> [`src/main/resources/avro-schemas/Order.avsc`](./src/main/resources/avro-schemas/Order.avsc)
> using the _org.apache.avro :: avro-maven-plugin_

## Requirements

- JDK version 17 or newer
- Maven 3.8 or newer

## How to run

### In the Terminal

```shell
mvn verify

```

Output ends with something like:

```
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.techeule.examples.avro.AvroToBytesSerializerDeserializerTest
...
Objavro.schema�{"type":"record","name":"Order","namespace":"com.techeule.examples.avro.schemas","fields":[{"name":"orderId","type":{"type":"string","avro.java.string":"String"},"doc":"The ID of a given order"},{"name":"customerId","type":{"type":"string","avro.java.string":"String"},"doc":"The customer-ID which placed the order"},{"name":"orderDateEpochSecondsUTC","type":"long","doc":"Order date represented in number of seconds since epoch (00:00:00 UTC on 1 January 1970)"}]}0�T�@q��/�
                          �j��Ha7e32a1f-863d-43e6-bf00-4dc7d865bda6Hf78fe4fe-045b-4364-913a-5980e090d06f�̽
                                                                                                          0�T�@q��/�
                                                                                                                    �j�
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.298 s - in com.techeule.examples.avro.AvroToBytesSerializerDeserializerTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.486 s
[INFO] Finished at: <some-date-time>
[INFO] ------------------------------------------------------------------------
```

It is important to see this in the output:
`[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0,`;
2 Tests are executed successfully!

### In an IDE

- Import/Open this project in the IDE
- Let the IDE build the project using Maven
- Let the IDE build the project using the build-in build process
- Execute all tests of this project

## Resources

- [Apache AVRO](https://avro.apache.org/)
- [AssertJ](https://assertj.github.io/doc/)
- [JUnit5](https://junit.org/junit5/docs/5.9.2/user-guide/)
- [TechEule.com](https://techeule.com/)
