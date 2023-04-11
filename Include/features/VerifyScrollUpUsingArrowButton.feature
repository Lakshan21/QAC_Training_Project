Feature: Test scrolling down the page and then scrolling up with arrow button functionality

  Scenario: User scrolls down the page and then scrolls up using arrow button
    Given user is on home page
 		Given user has scrolled down to subscription
 		And user clicks arrow button to scroll up
 		Then user is scrolled up
 		Then browser is closed
    