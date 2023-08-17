Feature: Palindrome Checker

  Scenario Outline: Check if palindrome
    Given I entered a word <word>
    When I test it for Palindrome
    Then the output should be <output>


    Examples:
      | word    | output |
      | "refer" | "true" |
      | "coin"  | "false"|
      | "techno"  | "true"|



