Feature: Test logout functionality

  Scenario: Check if logout feature is successful after logging in
    Given user is logged in
    And clicks on logout button
    Then user is navigated to the login page and logged out 
    Then browser is closed