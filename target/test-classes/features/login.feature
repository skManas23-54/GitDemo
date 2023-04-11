Feature:Login Page Scenario
  Scenario Outline:verify login with valid details
    When user click on  Gat Started button
    And enter mobile number as "<mobile>"
    And user click on continue button
    And user enter otp
    And user click on submit button
    And user allows permission
    Then user should see home page with profile name "<name>"
    Examples:
      | mobile     | name  |
      | 9040320799 | MANAS |