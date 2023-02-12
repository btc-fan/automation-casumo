# Automated Testing Framework
## Introduction
This is a guide on how to use the Automated Testing Framework for your projects. The framework is designed to provide an efficient and reliable way to test your application. This document will provide you with information on the technology stack used, the requirements, and how to use the framework to run your tests.

## Technology Stack
The framework is built using the following technologies:

* Java
* Maven
* Rest-Assured
* JUnit
* Allure reporting plugin
## Requirements
To use the Automated Testing Framework, you need to have the following tools installed on your system:

* Java Development Kit (JDK)
* Maven
* An Integrated Development Environment (IDE) such as IntelliJ IDEA

## Set up
To set up the framework, follow these steps:

1. Clone the repository to your local machine
2. Open the project in your IDE
3. Configure the IDE to use the correct JDK and Maven. In IntelliJ IDEA, you can go to File > Project Structure > Project, and then select the JDK and Maven home directories.
4. Run mvn clean install in the terminal to install all the necessary dependencies.
5. Run the tests using the command mvn test. The results will be stored in the target/allure-results directory.
6. To generate the Allure report, run the command mvn allure:report. The report will be generated in the target/site/allure-maven-plugin directory.

## Writing tests
The framework uses the Rest-Assured library to write and run tests. You can write tests in JUnit and use the Allure reporting plugin to generate reports. To write a test, create a new JUnit class in the src/test/java directory, and write your test cases using the Rest-Assured library.

## Conclusion
The Automated Testing Framework provides a reliable and efficient way to test your application. By following the steps outlined in this guide, you can easily set up and use the framework to run your tests. If you encounter any issues, you can refer to the documentation of the technologies used in the framework, or reach out to the support team for assistance.