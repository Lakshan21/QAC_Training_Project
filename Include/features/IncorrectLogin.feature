Feature: Test incorrect login functionality

  Scenario: Check if login is unsuccessful with invalid credentials 
  	Given user is on home page
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button and tries to login
    Then user is shown an error message 
    Then browser is closed