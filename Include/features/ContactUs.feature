Feature: Test contact us form functionality

  Scenario: Check if logout feature is successful after logging in
    Given user is on home page
    Given user is on contact us page
    When user fills out contact us details
    And clicks on submit button
    Then user is given a success message 
    Then browser is closed
    
    WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.automationexercise.com/')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Automation Exercise/h1_AutomationExercise'), 'AutomationExercise')
    