$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myproject/homepage/nhsToolUsage.feature");
formatter.feature({
  "line": 2,
  "name": "NHS tool usage for England",
  "description": "",
  "id": "nhs-tool-usage-for-england",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@focus"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "nhs-tool-usage-for-england;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am a citizen of the UK and on NHS checker tool app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I put my circumstances into the Checker tool",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "NhsAppForEngland.i_am_a_citizen_of_the_UK_and_on_NHS_checker_tool_app()"
});
formatter.result({
  "duration": 7182504708,
  "status": "passed"
});
formatter.match({
  "location": "NhsAppForEngland.i_put_my_circumstances_into_the_Checker_tool()"
});
formatter.result({
  "duration": 4868167500,
  "status": "passed"
});
formatter.match({
  "location": "NhsAppForEngland.i_should_get_a_result_of_whether_I_will_get_help_or_not()"
});
formatter.result({
  "duration": 64433667,
  "status": "passed"
});
});