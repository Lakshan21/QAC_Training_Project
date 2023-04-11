Feature: Test registering a user with an existing email functionality

  Scenario: Check if registering a user with existing email gives an error
  	Given user is on home page
    Given user is on sign up page
    When user enters a name and existing email
    And clicks on signup button
    Then user receives an email already exists message
    Then browser is closed