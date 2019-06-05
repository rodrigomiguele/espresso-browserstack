Feature: Ensure inputs

  Scenario: Ensure single input is handled
    When I click the button "1"
    Then the value "1" should be displayed

  Scenario: Ensure multiple inputs are handled
    When I click the button "1"
    And I click the button "2"
    Then the value "12" should be displayed