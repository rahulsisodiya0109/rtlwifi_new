
Feature: Login Facebook

Scenario: Facebook login with correct userName and Password

Given Facebook login page is open
When I enter the correct userid "abc"
And I enter correct password 123
And I click Login button
Then Login Successfully