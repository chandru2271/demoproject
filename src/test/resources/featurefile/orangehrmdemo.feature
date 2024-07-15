Feature: checking the login functionality of orangehrm page
@smoke
  Scenario: login the orangehrm page
    Given user launches the orangehrm url
    When user enters username
    And user enters password
    And user clicks on orangelogin button
    Then user should logged in successfully

  Scenario: login the orangehrm page using parameters
    Given user launches the orangehrm url
    When user enters username "Admin"
    And user enters password "admin123"
    And user clicks on orangelogin button
    Then user should logged in successfully

  Scenario Outline: login the orangehrm page with multiple datas
    Given user launches the orangehrm url
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks on orangelogin button
    Then user should logged in successfully

    Examples: 
      | username | password |
      | Admin    | admin123 |
