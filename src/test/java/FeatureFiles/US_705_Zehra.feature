Feature: Adding and removing items from cart

  Background:
    Given Navigate to Magento Website
    When Click on the Sign In button
    Then Finally, user must login to the account
    And User should see successful login message

    Scenario: User should select an item and delete it
      When Click on random category from Tab Menu
      Then Add random item from the list to cart
      And Delete the item from the cart