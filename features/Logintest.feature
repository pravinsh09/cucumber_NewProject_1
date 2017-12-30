Feature: Logging into Webuy

In order to work
As a sales person
I want to login

@test1
Scenario: Logging in Webuy

Given I go to "QAEnvironment" 
And I click on "SigninButton"
And I enter "username" as "pravin.sh9@gmail.com"
And I enter "password" as "jay123"
And I click on "loginButton"
Then login should be "success"
