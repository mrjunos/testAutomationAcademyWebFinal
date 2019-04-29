@register
Feature: Register user
  As a user, i want to register into the system when i provide name, last name, email and password.

  Scenario Outline: Registering user
    Given I am in "http://www.espn.com/?src=com&_adblock=true" Page
    When I click on Sign Up button
    And The registration modal is visible
    And I fill in First Name with "<name>"
    And I fill in Last Name with "<lastName>"
    And I fill in Email Address with "<email>"
    And I fill in Password with "<password>"
    And I click on Sign Up button Inside Modal
    And I put the cursor over the user icon
    Then I see a Log Out link
    Examples:
      | name | lastName | email | password |
      | JuanJose | CanoDuque | 12password1@asd.com  | password123* |
      | nombre2  | lastName2 | 12email@emailsdd.com | password123* |