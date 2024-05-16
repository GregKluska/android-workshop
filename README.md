# Android Workshop

An application to demonstrate skills and to play with different android-related tools and libraries.

## Requirements
The project is build with Java 17, so you'll need to install JVM17.

Before you start, run `gradle setup` task to get githooks installed either with IDE or by running `./gradlew setup` in the terminal.

## Note
The project uses Detekt for static code analysis and it's formatter (ktlint). 
I also created Gradle Convention Plugins with are placed in `gradle/build-logic` to keep the project setup in a single place.