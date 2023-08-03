@CTApp
Feature: Add 7th item to the bag

  Scenario: Add 7th item from Men > Clothing > Knitwear category

    Given I launch the app Cotton Traders
    When I Navigate to "Shop" bottom navigation
    And I Navigate to "Men collapsed>Clothing collapsed>Knitwear"
    Then I Select the "Seventh" item displayed
    And I Select a colour
    And I Add to Bag
    And I select a size
    And I view Snack bar
    And I View Bag

