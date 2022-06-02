@login
Feature: User should be able to navigation menu
  @Teacher
  Scenario: Login as a teacher
    Given the user is on the login page
    When the user enters teacher credentials
    Then the user should be able to login

   @Student
  Scenario: Login as a student
      Given the user is on the login page
      When the user enters student credentials
      Then the user should be able to login

  @Developer
  Scenario: Login as a developer
    Given the user is on the login page
    When the user enters developer credentials
    Then the user should be able to login

  @tester
  Scenario: Login as a tester
    Given the user is on the login page
    When the user enters tester credentials
    Then the user should be able to login