Feature: Test adding products to cart from home page functionality

  Scenario: Check if products are added to cart from home page
 		When user adds products from homepage
    And user clicks cart button
    When user waits for page to load
    When user checks for ad
   	Then user is on cart page
	