Feature: Test loggining a user before checkout functionality

  Scenario: User logs in and checks out items
  	Given user is logged in
    When user adds products from homepage
    And user clicks cart button
    When user waits for page to load
    When user checks for ad
   	Then user is on cart page
		And clicks proceed to checkout button
		When user waits for page to load
		When user checks for ad
		When logged in user verifies address details
		When user adds a comment
		And user clicks on place order
		When user checks for ad
		When logged in user enters card details
		And clicks pay and confirm 
		Then order is placed
		And user clicks continue
		When user waits for page to load
		When user checks for ad
		And clicks on logout button
		Then browser is closed