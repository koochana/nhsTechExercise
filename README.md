# nhsTechExercise
Shireesha's nhsTechExercise

BDD: Java Maven Cucumber Selenium Setup
Java + Junit + Cucumber + Selenium testing cases

This repo contains the Maven setup for Cucumber / Selenium, with Searching Google with Cheese as example code, which can be run on local or connect to remote SaucsLabs / TestingBot for cross browser testings. Also it can be configured in your CI server (i.e. Bamboo) for continuous testing. It helps to setup a BDD environment for User Acceptance tests.

This repo can be run on local Windows / Mac / Linux Platform, as long as you have Java/Maven setup correctly.

Setup
Install on Local Machine
Install Java & Maven on your local machine

= To Run (Maven command line) =

Local machine with browser name (ie / chrome / firefox / safari)

Test with Google Chrome (Mac / Windows for machineType):
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="googlechrome" -DmachineType="mac"
Test with Firefox (Mac / Windows for machineType):
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="firefox" -DmachineType="mac"
Test with IE (Windows Only):
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="ie"
Test with Safari (After install Safari extension, see /drivers/README.md):
> mvn test -DsiteUrl=http://www.google.com -DbrowserName="safari"
Remote Webdriver:

Testingbot (You can pass through Bamboo build variable for api key)
> mvn test -DsiteUrl=http://www.google.com -DenvName="remote" -DremoteWebDriver="http://<testingbot api key>@hub.testingbot.com:4444/wd/hub"
SauceLabs (You can pass through Bamboo build variable for api key)
> mvn test -DsiteUrl=http://www.google.com -DenvName="remote" -DremoteWebDriver="http://<saucelabs api key>@ondemand.saucelabs.com:80/wd/hub"
WebDriver Update
See README inside /drivers folder

Before we start
Feature file: Gherkin Syntax
Gherkin is the language that Cucumber understands. You can find more Gherin Syntax here: https://github.com/cucumber/cucumber/wiki/Gherkin

Selenium Syntax
Selenium is an automated web browser testing. You can find some commonly used Selenium commands here: http://www.seleniumhq.org/docs/02_selenium_ide.jsp#commonly-used-selenium-commands

Configure your project siteUrl
You can update the siteUrl in the pom.xml property (default is http://www.google.com for my example) for your application need, also you can pass in from command line
