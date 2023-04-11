Feature: Test registering a user before checkout functionality

  Scenario: Registering a new user and checking out items
  	Given user is registered
    When user adds products from homepage
    And user clicks cart button
    When user waits for page to load
    When user checks for ad
   	Then user is on cart page
		And clicks proceed to checkout button
		When user waits for page to load
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