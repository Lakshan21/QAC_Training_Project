Feature: Test subscription functionality from cart page

  Scenario: Check if subscription is functional from cart page
    Given user is on home page
    And clicks on cart button
    When user waits for page to load
    When user checks for ad
    Given user is on cart page
    Given user has scrolled down to subscription
    When user enters email for subscription
    And user clicks subscribe button
    When user waits for page to load
    When user checks for ad
    Then user is subscribed
    Then browser is closed