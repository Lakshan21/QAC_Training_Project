Feature: Test adding a review on product functionality

  Scenario: User adds a review on a product
    Given user is on home page
    And clicks on products button
    When user waits for page to load
    When user checks for ad
    Then user is on products page
    When user goes to the product they want to review
   	And clicks view product on product they want to review
   	When user checks for ad
   	Given user can write their review
   	When user writes their review
   	And clicks the submit review button
   	Then the review is submitted
    Then browser is closed