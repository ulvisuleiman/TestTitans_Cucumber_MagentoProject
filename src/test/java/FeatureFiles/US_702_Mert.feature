Feature: Login Functionality

  Background:
    Given Navigate to Magento Website

  Scenario: Login with null or wrong username and password
    When Click on the sign In button
    Then Log in without filling in username and password
    And User should receive incorrect login warning

    And User should only fill in the e-mail section
    And User should receive password warning

    And User should only fill in the password section
    And User should receive e-mail warning

    And User must enter wrong email and password
    And User should receive incorrect email and password warning
