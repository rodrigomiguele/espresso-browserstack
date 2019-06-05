Feature: Ensure random

  Scenario: Zero multiplication
    When I click the button "2"
    And I click the button "*"
    And I click the button "0"
    And I click the button "="
    Then the value "0" should be displayed

  Scenario: Zero division
    When I click the button "2"
    And I click the button "/"
    And I click the button "0"
    And I click the button "="
    Then the value "∞" should be displayed