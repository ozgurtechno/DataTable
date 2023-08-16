Feature: Contact Us
  As a user I want to be able to contact

  Scenario: Contact form example
    Given Navigate to Exercise page
    And Click on the Contact Us Button
    And Fill the Form with this Data
      | Techno | techno@technoStudy.com | Datatable | This is our message |
    And Click Submit Button
    Then Verify Form is submitted