Feature: Login Functionality with APACHE POI

  Background:
    Given Navigate to Magento Website

  Scenario: Login with valid username and password
    When Click on the Sign In button
    Then Finally, user must login to the account
    Then User should see successful login message

    And User should click on the Logout button
    And User should be able to see the Forgot my Password button