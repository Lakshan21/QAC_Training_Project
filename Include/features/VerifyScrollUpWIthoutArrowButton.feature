Feature: Test scrolling down the page and then scrolling up without arrow button functionality

  Scenario: User scrolls down the page and then scrolls up without using the arrow button
    Given user is on home page
 		Given user has scrolled down to subscription
 		When user scrolls up
 		Then user is scrolled up
 		Then browser is closed