Feature: verifying the omrbranchgrocery login page

  Scenario Outline: verifying omrbranchgrocery with valid data
    Given user is on omrpage
    When user enter "<username>" and "<password>"
    And user click the login btn
    Then user sdhould verfy the success msm for login

    Examples: 
      | username                 | password  |
      | vickyrocker478@gmail.com | Vicky@123 |
