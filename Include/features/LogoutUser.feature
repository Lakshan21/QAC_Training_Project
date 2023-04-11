Feature: Test logout functionality

  Scenario: Check if logout feature is successful after logging in
    Given user is logged in
    And clicks on logout button
    When user waits for page to load
    When user checks for ad
    Then user is navigated to the login page and logged out 
    Then browser is closed