Feature: Test contact us form functionality

  Scenario: Check if contact us page is functional
    Given user is on home page
    Given user is on contact us page
    When user fills out contact us details
    And clicks on submit button
    Then user is given a success message and navigates to home page 
    Then browser is closed
    
   