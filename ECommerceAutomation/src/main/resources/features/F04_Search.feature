@smoke
Feature: searching for an item

  Scenario: user wants to search for an item
    Given user clicks on search bar
    Then Item is searched for

  Scenario: user search with sku
    Given user types the sku
    Then Item search happens

