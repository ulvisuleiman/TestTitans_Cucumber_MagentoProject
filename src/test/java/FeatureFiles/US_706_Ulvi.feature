Feature: Address Addition

  Background:
    Given Navigate to Magento Shopping Website
    When User must login to the account
    Then User must click on My Account and Manage Address button

  Scenario Outline:
    When User should add new address
      | firstNameInput | <firstName>   |
      | lastNameInput  | <lastName>    |
      | streetInput    | <street>      |
      | cityInput      | <city>        |
      | stateInput     | <state>       |
      | postCodeInput  | <postCode>    |
      | phoneInput     | <phoneNumber> |
      | countryIdInput | <countryId>   |
    Then User should mark one address as the default address
    And User saves the changes

    Examples:
      | firstName | lastName | street            | city    | state    | postCode | phoneNumber | countryId |
      | Alex      | Johnson  | 789 Oak Boulevard | Chicago | Illinois | 60601    | 555-9012    | USA       |