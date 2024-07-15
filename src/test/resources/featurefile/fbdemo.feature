Feature: checking the login functionality of facebook page
@sanity
Scenario: login the page using valid credentials

Given user launches the fb url

When user enter the username
And user enter the password
And user clicks on login button
Then user should be logged in successfully