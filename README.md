
Selenium-Cucumber-Java
This repository contains a collection of sample projects and libraries that demonstrate how to use selenium-cucumber-java, a BDD (Behavior-Driven Development) framework with Cucumber (v 3.0.0) and Java. 
The projects showcase automation script development

This project showcases  a BDD approach for automated Testing using Cucumber,Selenium and Java

##Features:

** Cucumber: Write feature file using Gherkin syntax.
**Selenium: Implement web automation using selenium web Driver.
** Java: Leverage the power of Java for implementing step Definitions and supporting code.
**Maven: Use maven for project build and dependency management.


Installation & Prerequisites

JDK  (Ensure that the Java class path is properly set)
Maven (Ensure that the class path is properly set)
Eclipse IDE
Required Eclipse Plugins:
Maven
Cucumber
Browser driver (Ensure that you have the appropriate browser driver for your desired browser and that the class path is correctly configured)

FRAMEWORK ARCHITECTURE:

src/main/java/features : contains all feature files.
src/main/java/stepDefinition : contains all stepDefinition file corresponding to feature defined.
src/main/java/TestRunner: Executes cucumber feature file and co-ordinates with step definition.
src/main/java/pageobjects: contains pageobject model classes where locators are defined and contains a class responsible for creating objects.
src/main/java/Resources: contains chromedriver.exe file.
src/main/java/utils: contains java classes where methods are defined to be shared , TestBase - contains Browser Initialization , Generic class- used to make use of reusable code.


TestExecution
Run as Junit Test
