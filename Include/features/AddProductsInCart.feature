Feature: Test adding products to cart functionality

  Scenario: Check if products are added to cart
    Given user is on home page
    And clicks on products button
    When user waits for page to load
    When user checks for ad
   	Then user is on products page
    When user adds products to cart
    And clicks view cart button
   	When user waits for page to load
   	When user checks for ad
    Given user is on cart page
    Then products are added to cart
    Then browser is closed