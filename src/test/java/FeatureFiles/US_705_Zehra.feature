Feature: Adding and removing items from cart

  Background:
    Given Navigate to Magento Website
    When User must login to the account


    Scenario: User should select an item and delete it
      When Click on random category from Tab Menu
      Then Add random item from the list
      And Select random size and color of the item and add to cart
      And Delete the item from the cart
      And Once deleting one item empty cart message should be seen