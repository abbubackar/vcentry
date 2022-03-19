Feature: validate a login page

Scenario: validate using valid credentials
Given open web browser
Then enter url " https://opensource-demo.orangehrmlive.com/"
Then enter valid username "Admin"
Then enter valid password  "admin123"
And click login