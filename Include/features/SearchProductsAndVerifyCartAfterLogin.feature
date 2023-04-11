Feature: Test searching products and verifying cart after login functionality

  Scenario: Search products and cart them and verify if it's still in cart after login
    Given user is on home page
    And clicks on products button
    When user waits for page to load
    When user checks for ad
    Then user is on products page
    When user searches for a product
   	And clicks search button
   	When user waits for page to load
   	When user checks for ad
   	Then searched product results are shown
   	Then searched products are added to cart
   	And user clicks cart button
   	When user waits for page to load
    When user checks for ad
   	Given user is on cart page
   	Then searched products are in cart
   	Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page and logged in
    And user clicks cart button
    When user waits for page to load
    When user checks for ad
   	Given user is on cart page
   	Then searched products are in cart
    Then browser is closed