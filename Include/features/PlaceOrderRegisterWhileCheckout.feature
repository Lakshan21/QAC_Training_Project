Feature: Test adding products to cart from home page functionality

  Scenario: Check if products are added to cart from home page
  	Given user is on home page
 		When user adds products from homepage
    And user clicks cart button
    When user waits for page to load
    When user checks for ad
   	Then user is on cart page
		And clicks proceed to checkout button
		And clicks register button
		When user waits for page to load
		When user checks for ad
		Given user is on sign up page
    When user enters name and email
    And clicks on signup button
    Given user is on account information page
    When user enters account information
    And clicks on create account button
    And user clicks continue 
    When user checks for ad
    Then registered user is logged in
		When user clicks cart button
		When user waits for page to load
		When user checks for ad
		Given user is on cart page
		And clicks proceed to checkout button
		When user checks for ad
		When user verifies address details
		When user adds a comment
		And user clicks on place order
		When user checks for ad
		When user enters card details
		And clicks pay and confirm
		Then order is placed
		And user clicks continue
		When user checks for ad
		And clicks delete account
		Then account is deleted
		And user clicks continue
		Then browser is closed