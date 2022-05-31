@smoke
Feature: user select multiple categories
  Scenario: open the header menu and select random category then hover
    Given Hover the header menu and select random category then hover it
    When click on random sub-category if it exists
    Then sub-category page opened