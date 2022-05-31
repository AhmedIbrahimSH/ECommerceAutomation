@smoke
Feature: adding products to the cart


  Scenario: User add a product and add it to cart

    Given choose a  product and click on it
    When Click on add button

    Then  product is added successfully to the user's shopping cart