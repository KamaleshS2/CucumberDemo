
Feature: Place Order


  Scenario: Search single item
    Given User is on Home Page
    When User search an item "Parry Hotter"
    Then Item must be listed
    
  Scenario: Add item to cart
    Given User should be on Search result page
    When User add item to cart
    Then Item must be added  

  Scenario: Checkout order
    When User do checkout
    Then Should navigated to Checkout page