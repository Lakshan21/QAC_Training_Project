Feature: Verify the products page and product details is functional

  Scenario: Check if products page and products details are displayed
    Given user is on home page
    And clicks on products button
    When user waits for page to load
    When user checks for ad
    Then user is on products page
    And clicks view product
    When user waits for page to load
    When user checks for ad
    Then product details are shown
    Then browser is closed