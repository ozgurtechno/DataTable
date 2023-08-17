#Scenario: eat 5 out of 12
#Given there are 12 cucumbers
#When I eat 5 cucumbers
#Then I should have 7 cucumbers
#
#Scenario: eat 6 out of 17
#Given there are 23 cucumbers
#When I eat 8 cucumbers
#Then I should have 1 cucumbers


Feature: Eating

  Scenario Outline: eating
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers

    Examples:
      | start | eat | left |
      |    12 |   5 |    7 |
      |    20 |   5 |   15 |