Feature: Login Functionality
  As a user I want to bi able to login with my valid credentials
  so I can reach my info


  Scenario Outline: Login with valid username and password
    Given Navigate to Campus
    When Enter <username> and <password>
    And Click on Login Button
    Then User should login successfully


    Examples:
      | username | password |
      | "turkeyts" | "TechnoStudy123"  |
      | "ahmet" | "Hello" |