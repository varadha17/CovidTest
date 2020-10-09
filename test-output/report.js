$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Abinash/eclipse-workspace/covid19/src/main/java/covid/feature/India.feature");
formatter.feature({
  "line": 2,
  "name": "Validate India page",
  "description": "",
  "id": "validate-india-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@india"
    }
  ]
});
formatter.before({
  "duration": 9326289900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Validate India link",
  "description": "",
  "id": "validate-india-page;validate-india-link",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Click India link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "get the confirmed case count",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "get the active case count",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "get the recovered case count",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "get the deceased case count",
  "keyword": "Then "
});
formatter.match({
  "location": "IndiaTest.click_India_link()"
});
formatter.result({
  "duration": 202136900,
  "status": "passed"
});
formatter.match({
  "location": "IndiaTest.get_the_confirmed_case_count()"
});
formatter.result({
  "duration": 46793100,
  "status": "passed"
});
formatter.match({
  "location": "IndiaTest.get_the_active_case_count()"
});
formatter.result({
  "duration": 43138200,
  "status": "passed"
});
formatter.match({
  "location": "IndiaTest.get_the_recovered_case_count()"
});
formatter.result({
  "duration": 34413000,
  "status": "passed"
});
formatter.match({
  "location": "IndiaTest.get_the_deceased_case_count()"
});
formatter.result({
  "duration": 44343300,
  "status": "passed"
});
formatter.after({
  "duration": 1158893100,
  "status": "passed"
});
});