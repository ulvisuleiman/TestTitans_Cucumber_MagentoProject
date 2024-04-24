Feature: Product Ordering

  Background:
    Given Navigate to Magento Shopping Website
    When User must login to the account

    Scenario:
      Given User selects a product from the items
      When User adds the product to the cart and completes the order
      Then User should see successful payment message