Feature: Test registering a user functionality

  Scenario: Registering a new user
  	Given user is on home page
    Given user is on sign up page
    When user enters name and email
    And clicks on signup button
    When user waits for page to load
    Given user is on account information page
    When user enters account information
    And clicks on create account button
    When user waits for page to load
    And user clicks continue 
    When user checks for ad
    Then registered user is logged in