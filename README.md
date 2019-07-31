# Kotlin Nim

A quick test of Kotlin and IntelliJ backed up, implementation of
[Nim](https://en.wikipedia.org/wiki/Nim).

## Install and run

Install [Java
JRE](https://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html)
and Kotlin, build and run.

Example Ubunut:

```sh
# Install JRE
sudo apt install default-jre

# Install Kotlin
curl -s https://get.sdkman.io | bash

# Compile to JAR
kotlinc src/main/kotlin/* -include-runtime -d kotlin-nim.jar

# Run with argument
java -jar kotlin-nim.jar 20
```
