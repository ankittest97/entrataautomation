$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactCredentials.feature");
formatter.feature({
  "line": 3,
  "name": "ContactCredentials",
  "description": "",
  "id": "contactcredentials",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 37,
  "name": "Validate whether user is able to Register in base Camp page",
  "description": "",
  "id": "contactcredentials;validate-whether-user-is-able-to-register-in-base-camp-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Regression_TC_03"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User is on Application Home Page \"\u003cTcNo\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user clicks on Sign In button \"\u003cTcNo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "user clicks on Property Manager LoginButton \"\u003cTcNo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user enters username and password \"\u003cTcNo\u003e\" \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "contactcredentials;validate-whether-user-is-able-to-register-in-base-camp-page;",
  "rows": [
    {
      "cells": [
        "TcNo",
        "username",
        "password"
      ],
      "line": 44,
      "id": "contactcredentials;validate-whether-user-is-able-to-register-in-base-camp-page;;1"
    },
    {
      "cells": [
        "Regression_TC_03",
        "standard_user",
        "standard"
      ],
      "line": 45,
      "id": "contactcredentials;validate-whether-user-is-able-to-register-in-base-camp-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 45,
  "name": "Validate whether user is able to Register in base Camp page",
  "description": "",
  "id": "contactcredentials;validate-whether-user-is-able-to-register-in-base-camp-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 36,
      "name": "@Regression_TC_03"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "User is on Application Home Page \"Regression_TC_03\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 39,
  "name": "user clicks on Sign In button \"Regression_TC_03\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "user clicks on Property Manager LoginButton \"Regression_TC_03\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user enters username and password \"Regression_TC_03\" \"standard_user\" \"standard\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_03",
      "offset": 34
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_is_on_Application_Home_Page(String)"
});
formatter.result({
  "duration": 25804327501,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_03",
      "offset": 31
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_clicks_on_Sign_In_button(String)"
});
formatter.result({
  "duration": 5266819100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_03",
      "offset": 45
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_clicks_on_Property_Manager_LoginButton(String)"
});
formatter.result({
  "duration": 3303185600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Regression_TC_03",
      "offset": 35
    },
    {
      "val": "standard_user",
      "offset": 54
    },
    {
      "val": "standard",
      "offset": 70
    }
  ],
  "location": "ContactCredentialsStepDefinition.user_enters_username_and_password(String,String,String)"
});
formatter.result({
  "duration": 846122400,
  "status": "passed"
});
});