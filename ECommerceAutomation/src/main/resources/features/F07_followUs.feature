@smoke
Feature: following social media links

  Scenario: user opens facebook link
    Given user clicks on facebook icon
    Then user is navigated to the facebook page

  Scenario: user opens twitter link
    Given user clicks on twitter icon
    Then user is navigated to the twitter page

  Scenario: user opens rss link
    Given user clicks on rss icon
    Then user is navigated to the rss page

  Scenario: user opens youtube link
    Given user clicks on youtube icon
    Then user is navigated to the youtube page