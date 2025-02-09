# Pitest Introduction
This project is created to show a small, hello-world-like usage of the Pitest.
Two examples can be found here. One with Maven as a build tool and one with Gradle.

## Maven
Starting maven command: `mvn test-compile org.pitest:pitest-maven:mutationCoverage`

**Note**: 
- In the pom.xml the release of Junit was set to 5.11.4. The newest release candidate has not worked correctly with the PIT Intellij plugin.
- Using PIT needs the addition of plugin information to Maven.

## Gradle
Starting maven command: `gradle pitest`

**Note**: 
- Using PIT needs the addition of plugin information to Gradle.
