@focus
Feature: NHS tool usage for England

  Scenario:
    Given I am a citizen of the UK and on NHS checker tool app
    When I put my circumstances into the Checker tool
    Then I should get a result of whether I will get help or not