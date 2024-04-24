Feature: Address Addition

  Background:
    Given Navigate to Magento Shopping Website
    When User must login to the account
    Then User must click on My Account and Manage Address button

  Scenario Outline:
    Given Click on Add New Address button
    When User should add new address
      | firstNameInput | <firstName>   |
      | lastNameInput  | <lastName>    |
      | streetInput    | <street>      |
      | cityInput      | <city>        |
      | postCodeInput  | <postCode>    |
      | phoneInput     | <phoneNumber> |

    Then User should mark one address as the default address
    And User saves the changes

    Examples:
      | firstName | lastName | street            | city    |  postCode | phoneNumber |
      | Alex      | Johnson  | 789 Oak Boulevard | Chicago |  60601    | 555-9012    |