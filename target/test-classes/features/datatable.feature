Feature: signup functionality

@SmokeTest
Scenario: new user sign up into account
Given user should navigate to current url
When user signup with entering follwing details
|pujitha|karanam|pujitha@gmail.com|Liverpool|
Then user should see the homepage succesfully