Feature: Test removing products from cart functionality

  Scenario: Removing products from cart
  	Given user is on home page
    When user adds products from homepage
    And user clicks cart button
    When user waits for page to load
    When user checks for ad
    Then user is on cart page
    Then products are added to cart
    And user removes a product
    Then product is removed
    Then browser is closed