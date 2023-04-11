Feature: Verify the test cases page is functional

  Scenario: Check if test cases page is functional
    Given user is on home page
    And clicks on test cases button
    When user waits for page to load
    When user checks for ad
    Then user is on test cases page
    Then browser is closed