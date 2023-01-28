# Apache AVRO Serialization and De-Serialization java example for [TechEule.com](https://techeule.com/)

> All provided paths in this file are relative to the root-folder
> of this git-repository.

At [TechEule.com](https://techeule.com/) you can find more info about this repository.

## Code

The Java-Code is written as Unit-Tests:
[`src/test/java/com/techeule/examples/avro/AvroSerializationAndDeSerializationTest.java`](./src/test/java/com/techeule/examples/avro/AvroSerializationAndDeSerializationTest.java)

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
[INFO] Running com.techeule.examples.avro.AvroSerializationAndDeSerializationTest
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Objavro.schema�{"type":"record","name":"Order","namespace":"com.techeule.examples.avro.schemas","fields":[{"name":"orderId","type":{"type":"string","avro.java.string":"String"},"doc":"The ID of a given order"},{"name":"customerId","type":{"type":"string","avro.java.string":"String"},"doc":"The customer-ID which placed the order"},{"name":"orderDateEpochSecondsUTC","type":"long","doc":"Order date represented in number of seconds since epoch (00:00:00 UTC on 1 January 1970)"}]} ���P�{W�-D[.��Hef6a2ef8-41f1-40c6-824c-07f78b7e48fbHe043528c-4c93-4f0d-87ee-7d2bd478f2fe�ӣ�
                                                                                                            ���P�{W�-D[.�
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.28 s - in com.techeule.examples.avro.AvroSerializationAndDeSerializationTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ avro-serialization-deserialization ---
[INFO] Building jar: <path-to-this-repo>/target/avro-serialization-deserialization-1.0-SNAPSHOT.jar
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
