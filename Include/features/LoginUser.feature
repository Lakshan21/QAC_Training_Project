Feature: Test login functionality

  Scenario: Check if login is successful with valid credentials
  	Given user is on home page
    Given user is on login page
    When user enters username and password
    And clicks on login button
    When user waits for page to load
    When user checks for ad
    Then user is navigated to the home page and logged in
