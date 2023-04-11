Feature: Test if viewing category products is functional

  Scenario: View category products
    Given user is on home page
    Given category products is visible on home page
		When user clicks dress category under women category
		When user checks for ad
		Then women dress products are visible
    When user clicks t-shirts category under men category
    Then men t-shirt products are visible
    Then browser is closed