Feature: Search Functionality

  Background:
    Given Navigate to Magento Shopping Website
    When User must login to the account

    Scenario: Finding Product
      Given Search for the jacket name as Taurus Elements Shell
      When User must verify the Product
      Then User must search for the product name as "MJ09" in search box
      And User must enter an invalid product code as "KTYU" in search box
      And User should see the error message
