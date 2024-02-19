# entrataautomation
# Selenium-Cucumber-Java

This repository contains a collection of sample projects and libraries that demonstrate how to use `selenium-cucumber-java`, a BDD (Behavior-Driven Development) framework with Cucumber (v3.0.0) and Java. The projects showcase automation script development.

## Features:

- **Cucumber:** Write feature files using Gherkin syntax.
- **Selenium:** Implement web automation using Selenium WebDriver.
- **Java:** Leverage the power of Java for implementing step definitions and supporting code.
- **Maven:** Use Maven for project build and dependency management.

## Installation & Prerequisites:

Ensure the following are installed and properly configured:

- **JDK:** Ensure that the Java classpath is set up correctly.
- **Maven:** Ensure that the classpath is set up correctly.
- **Eclipse IDE:** Required for development.
- **Eclipse Plugins:** Maven, Cucumber.
- **Browser driver:** Ensure that you have the appropriate browser driver for your desired browser, and the classpath is correctly configured.

## Framework Architecture:

- **src/main/java/features:** Contains all feature files.
- **src/main/java/stepDefinition:** Contains all step definition files corresponding to the defined features.
- **src/main/java/TestRunner:** Executes Cucumber feature files and coordinates with step definitions.
- **src/main/java/pageobjects:** Contains Page Object Model (POM) classes where locators are defined and a class responsible for creating objects.
- **src/main/java/Resources:** Contains `chromedriver.exe` file.
- **src/main/java/utils:** Contains Java classes where methods are defined to be shared.
  - **TestBase:** Contains Browser Initialization.
  - **Generic class:** Used to make use of reusable code.

Wired browser and that the class path is correctly configured)

FRAMEWORK ARCHITECTURE:

src/main/java/features : contains all feature files.
src/main/java/stepDefinition : contains all stepDefinition file corresponding to feature defined.
src/main/java/TestRunner: Executes cucumber feature file and co-ordinates with step definition.
src/main/java/pageobjects: contains pageobject model classes where locators are defined and contains a class responsible for creating objects.
src/main/java/Resources: contains chromedriver.exe file.
src/main/java/utils: contains java classes where methods are defined to be shared , TestBase - contains Browser Initialization , Generic class- used to make use of reusable code.


TestExecution
Run as Junit Test
