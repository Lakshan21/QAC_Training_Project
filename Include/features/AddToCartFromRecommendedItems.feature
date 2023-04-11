Feature: Test adding a product from recommended items functionality

  Scenario: User adds a recommended item to cart
    Given user is on home page
  	Given user scrolls to recommended products
  	When user adds a recommended item to cart
  	And clicks view cart button
  	When user waits for page to load
  	When user checks for ad
  	Given user is on cart page
  	Then recommended products are added to cart
    Then browser is closed