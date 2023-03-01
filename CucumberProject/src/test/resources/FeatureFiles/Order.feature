
Feature: Order place

  Scenario: place an order for 1 iphone
    Given amazon home page is open
    And item list is open
    When i will select item
    And i will add quantity
    And i will click on place order
    And i will make payment
    Then order place successfully
    And order summary print