$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Logintest.feature");
formatter.feature({
  "line": 1,
  "name": "Logging into Webuy",
  "description": "\r\nIn order to work\r\nAs a sales person\r\nI want to login",
  "id": "logging-into-webuy",
  "keyword": "Feature"
});
formatter.before({
  "duration": 28666431205,
  "status": "passed"
});
formatter.before({
  "duration": 470026,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Logging in Webuy",
  "description": "",
  "id": "logging-into-webuy;logging-in-webuy",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I go to \"QAEnvironment\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on \"SigninButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter \"username\" as \"pravin.sh9@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter \"password\" as \"jay123\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on \"loginButton\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "login should be \"success\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "QAEnvironment",
      "offset": 9
    }
  ],
  "location": "Logintest.I_Go_To_Salesforce(String)"
});
formatter.result({
  "duration": 54446019877,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SigninButton",
      "offset": 12
    }
  ],
  "location": "Logintest.I_click_on(String)"
});
formatter.result({
  "duration": 12854372695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 9
    },
    {
      "val": "pravin.sh9@gmail.com",
      "offset": 23
    }
  ],
  "location": "Logintest.I_enter(String,String)"
});
formatter.result({
  "duration": 2421816091,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 9
    },
    {
      "val": "jay123",
      "offset": 23
    }
  ],
  "location": "Logintest.I_enter(String,String)"
});
formatter.result({
  "duration": 2174954402,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginButton",
      "offset": 12
    }
  ],
  "location": "Logintest.I_click_on(String)"
});
formatter.result({
  "duration": 12205995687,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 17
    }
  ],
  "location": "Logintest.Then_login_should_be(String)"
});
formatter.result({
  "duration": 163604,
  "status": "passed"
});
formatter.uri("SearchProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Search Product",
  "description": "\r\nIn order to work\r\nAs a sales person\r\nI want to login",
  "id": "search-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 171688,
  "status": "passed"
});
formatter.before({
  "duration": 101627,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Search Product",
  "description": "",
  "id": "search-product;search-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@test2"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I go to \"QAEnvironment\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "Enter the \"Samsung\" in \"ProductSearch\" field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I_click_on \"ProdSearch\" Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "QAEnvironment",
      "offset": 9
    }
  ],
  "location": "Logintest.I_Go_To_Salesforce(String)"
});
formatter.result({
  "duration": 17181001981,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung",
      "offset": 11
    },
    {
      "val": "ProductSearch",
      "offset": 24
    }
  ],
  "location": "SearchProduct.Enter_the_productname_in_ProductSearch_field(String,String)"
});
formatter.result({
  "duration": 8112489577,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ProdSearch",
      "offset": 12
    }
  ],
  "location": "SearchProduct.i_click_on_Button(String)"
});
formatter.result({
  "duration": 9113318377,
  "status": "passed"
});
});