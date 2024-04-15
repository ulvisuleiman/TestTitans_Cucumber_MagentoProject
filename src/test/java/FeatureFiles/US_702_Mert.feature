Feature: Login Functionality

  Scenario: Login with null username and password

    Given Navigate to Magento Website
    When Click on the Sign In button
    Then Log in without filling in username and password
    And User should receive incorrect login warning

    Then User should only fill in the e-mail section
    And User should receive password warning

    Then User should only fill in the password section
    And User should receive e-mail warning

    Then User must enter wrong email and password
    And User should receive incorrect email and password warning

    Then Finally, user must login to the account
    And User should see successful login message

    Then User should click on the Logout button
    And User should be able to see the Forgot my Password button