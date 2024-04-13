Feature: Register Functionality

  Scenario Outline: Register Functionality
    Given Navigate to Magento Website

    When Click on the register button
      | registerButton |

    Then fill in user information
      | firstname       |  | <fname>      |
      | lastname        |  | <lname>      |
      | email           |  | <mail>       |
      | password        |  | <pssword>    |
      | confirmPassword |  | <conPssword> |

    And Password strength control

    And Click on the Create an Account button
      | createAnAccountButton |

    And  User should be register successfullied

    Examples:
      | fname       |  | lname       |  | mail                    |  | pssword  |  | conPssword |
      | testTitans2 |  | TestTitans3 |  | TestTitans2@example.com |  | Passw0rd |  | Passw0rd   |