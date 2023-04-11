Feature: Test viewing and carting brand products functionality

  Scenario: View brand products and add them to cart
    Given user is on home page
    And clicks on products button
    When user waits for page to load
    When user checks for ad
    Given user can see Brands 
    And user clicks polo brand products
    When user waits for page to load
    When user checks for ad
    Then polo brand products are visible
    When user clicks HM brand products
    When user waits for page to load
    When user checks for ad
    Then HM brand products are visible
    Then browser is closed