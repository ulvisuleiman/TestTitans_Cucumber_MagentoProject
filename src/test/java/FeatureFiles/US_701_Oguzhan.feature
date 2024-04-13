Feature: Register Functionality

  Scenario Outline: Register Functionality
    Given Navigate to Magento Website

    When Click on the register button

    Then fill in user information

    And Click on the Create an Account button

    And  User should be register successfullied

    Examples:
      |  |