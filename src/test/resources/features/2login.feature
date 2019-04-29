@login
Feature: Login
  As a user, i want to login into the system when i provide email and password.

  Scenario Outline: Loging in with active user
    Given I am in "http://www.espn.com/?src=com&_adblock=true" Page
    When I click on Log In button
    And The Log In modal is visible
    And I fill in Email Address with "<email>"
    And I fill in Password with "<password>"
    And I click on Log In button Inside Modal
    And I put the cursor over the user icon
    Then I see a Log Out link
    Examples:
      | email                  | password  |
      | qwerp12345@asd1235.com | asdf1234* |