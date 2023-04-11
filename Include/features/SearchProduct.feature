Feature: Test search product functionality

  Scenario: Check if searching products is functional
    Given user is on home page
   	And clicks on products button
   	When user waits for page to load
   	When user checks for ad
    Then user is on products page
    When user searches a product
    And user clicks search button
    When user waits for page to load
    When user checks for ad
    Then searched products are displayed
    Then browser is closed