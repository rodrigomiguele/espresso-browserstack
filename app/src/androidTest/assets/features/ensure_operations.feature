Feature: Ensure operations

  Scenario: Ensure additions works
    When I click the button "1"
    And I click the button "2"
    And I click the button "+"
    And I click the button "2"
    And I click the button "1"
    And I click the button "="
    Then the value "33" should be displayed

  Scenario: Ensure subtractions works
    When I click the button "2"
    And I click the button "2"
    And I click the button "-"
    And I click the button "1"
    And I click the button "1"
    And I click the button "="
    Then the value "11" should be displayed

  Scenario: Ensure multiplication works
    When I click the button "1"
    And I click the button "2"
    And I click the button "*"
    And I click the button "5"
    And I click the button "="
    Then the value "60" should be displayed

  Scenario: Ensure division works
    When I click the button "1"
    And I click the button "2"
    And I click the button "/"
    And I click the button "3"
    And I click the button "="
    Then the value "4" should be displayed