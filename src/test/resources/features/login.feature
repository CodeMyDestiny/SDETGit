Feature: Login page automation of SauceDemo Application
@Login
Scenario Outline: Login with valid credentials
Given User is on the login page
When User enters "<username>" and "<password>"
And Clicks on login button
Then User should be redirected to the home page
And Close the browser

Examples:
| username                | password      |
| standard_user           | secret_sauce  |
