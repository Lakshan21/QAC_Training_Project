Feature: Test registering a user functionality

  Scenario: Registering a new user
  	Given user is on home page
    Given user is on sign up page
    When user enters name and email
    And clicks on signup button
    Given user is on account information page
    When user enters account information
    And clicks on create account button
    Then user account is created and navigated to the home page