Feature: Login into Application

Scenario: Positive test validating login
Given Initialize the browser with Chrome
And Navigate to "https://adirauat2012.autocillin.co.id:08/Travelcin" site
And Click on login link as Direct to icon Login
When user enters "pfendy@gmail.com" and "iNah90L"
Then verify that user is successfully logged in knowing the icon Profile

Scenario Outline: Negative test validating login
Given Initialize the browser with Chrome
And Navigate to "https://google.com" site
And Click on login link as Direct to icon Login
When user enters <email> and <password>
Then verify that user is successfully logged in knowing the icon Profile

Examples:
|email 			|password		|
|123@gmail.com	|123456			|