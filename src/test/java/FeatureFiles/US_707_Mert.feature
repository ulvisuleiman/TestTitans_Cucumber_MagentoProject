Feature: Search Functionality

  Background:
    Given Navigate to Magento Shopping Website
    When User must login to the account

    Scenario: Finding Product
      Given Search for the jacket name as "Taurus Elements Shell"
