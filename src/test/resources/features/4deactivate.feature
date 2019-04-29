@deactivate
Feature: Login
  As a user, i want to login into the system when i provide email and password.

  Scenario Outline: Loging in with active user
    Given I am in "http://www.espn.com/?src=com&_adblock=true" Page
    And I am logged in with "<email>" and "<password>"
    When I put the cursor over the user icon
    And I click on the ESPN Profile Link
    And The Update Your Account modal is visible
    And I Scroll to Delete Account Link
    And I click on Delete Account Link
    And The Yes, delete this account Button is visible
    And I click on Yes, delete this account Button
    Then I see a Your Account Has Been Deleted label
    Examples:
      | email                  | password  |
      | qwerp12345@asd1235.com | asdf1234* |