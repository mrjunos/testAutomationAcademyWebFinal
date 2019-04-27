@login
Feature: Login
  As a user, i want to login into the system when i provide email and password.

  Scenario Outline: Loging in with active user
    Given I am in "http://www.espn.com/?src=com&_adblock=true" Page
    When I click on "Entrar" button
    And The modal with a button "Conéctate" is visible
    And I fill in "Nombre de usuario o correo electrónico" with "<email>"
    And I fill in "Contraseña" with "<password>"
    And I click on "Conéctate" button
    And I put the cursor over the user icon
    Then I see a message "¡Bienvenido <name>!"
    Examples:
      | email            | password  |
      | jjcadu@gmail.com | password1 |
      | email@email2.com | password2 |