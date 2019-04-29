@login
Feature: Login
  As a user, i want to login into the system when i provide email and password.

  Scenario Outline: Loging in with active user
    Given I am in "http://www.espn.com/?src=com&_adblock=true" Page
    And I am logged in with "<email>" and "<password>"
    When I put the cursor over the user icon
    And I click on the Log Out link
    Then I see a Log In button
    Examples:
      | email            | password  |
      | jjcadu@gmail.com | password1 |
      | email@email2.com | password2 |