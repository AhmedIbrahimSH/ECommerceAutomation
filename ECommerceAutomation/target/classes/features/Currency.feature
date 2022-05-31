@smoke
Feature: user changes currency

  Scenario: currency changed correctly
    Given user clicks to change the sign
    And  user changes currency
    Then currency changed
