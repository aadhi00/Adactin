Feature: Verify login functionality of Adactin

  Scenario Outline: Verify user can login to Adactin Home
    Given User is on Adactin Page
    When User enters "<username>" and "<password>"
    And User clicks Login Button
    Then User should be redirected to the Search Hotel page

    Examples: 
      | username   | password  |
      | aadhithyan | asdfgf123 |