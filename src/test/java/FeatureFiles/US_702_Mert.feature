Feature: Login Functionality

  Scenario: Login with null username and password

    Given Navigate to Magento Website
    When Click on the Sign In button
    Then Log in without filling in username and password