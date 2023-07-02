@CTApp
Feature: Add 7th item to the bag

  Scenario: Add 7th item from Men > Clothing > Knitwear category
  (if not any category which has more than 7 items in the list) to the cart.
    Given Hit the url on the mobile app
    Given I launch the app Cotton Traders
    When I Navigate to "Shop" bottom navigation
    And I Navigate to "Men collapsed>Clothing collapsed>Knitwear"
    Then I Select the Seventh item displayed
    And I Select a colour
    And I Add to Bag
    And I select a size
    And I view Snack bar
    And I View Bag

