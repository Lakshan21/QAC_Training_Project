Feature: Test product quantity of added products in cart functionality

  Scenario: Check if products are added to cart are of correct quantity
    Given user is on home page
    When user views a product
    When user checks for ad
   	And adds a product of specific quantity to cart
    And clicks view cart button
    When user waits for page to load
    When user checks for ad
    Given user is on cart page
    Then product is added to cart of correct quantity
    Then browser is closed