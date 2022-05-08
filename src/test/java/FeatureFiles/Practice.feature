Feature: Application Login

Background: Common Tabs
Given Initialize the Chrome Browser
And Navigate to the "https://login.salesforce.com/?locale=in"

Scenario: Click on different tabs
When user clicks on Forgot password
Then user goes to the different page
When user clicks on Continue tab
Then the page refreshes

Scenario Outline: Salesforce HomePage Login
When user enters <Username> and <Password>
And clicks on Login button
Then user should be able to Login

Examples:
|Username|   |Password|
|Abhishek.salesforce| |Test12|
|Abhi.salesforce| |Test1234|

