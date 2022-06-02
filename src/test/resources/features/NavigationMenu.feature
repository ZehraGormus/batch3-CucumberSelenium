
Feature: Teacher should be able to Navigate Menu
Background:
  Given the user is on the login page
  When the user enters teacher credentials


  Scenario: Navigate developer menu

    Then the user goes to Developers menu
    And the user should be able to get the text of Developers

@123
  Scenario: navigate to All post

    Then the user goes to Developers menu
    Then the user goes All Posts menu
    And the user should get the text of Posts

@xyz
  Scenario: Navigate to My account

    Then the user should get the text of welcome
    Then the user goes My Account menu
    And the user should get the text of Dashboard


