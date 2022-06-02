Feature: Account Types
@Rerun
  Scenario: Teacher User
    Given the user is on the login page
    When the user logs in using "eurotech@gmail.com" and "Test12345!"
    Then the user should be able to login and see message "Eurotech"
  @Rerun
  Scenario: Student User
    Given the user is on the login page
    When the user logs in using "zehra@gmail.com" and "12345#"
    Then the user should be able to login and see message "zehra"
  @Rerun
  Scenario: Developer User
    Given the user is on the login page
    When the user logs in using "oyku@gmail.com" and "oyku123!"
    Then the user should be able to login and see message "oyku"
@123
  Scenario: Mentor User
    Given the user is on the login page
    When the user logs in using "havva@outlook.com" and "Havva123!"
    Then the user should be able to login and see message "Havva"

    Scenario Outline: First Outline Test
      Given the user is on the login page
      When the user logs in using "<userType>" and "Havva123!"
      Then the user should be able to login and see message "Havva"
      Examples:
      |userType|
      |havva@outlook.com|
      |havva@outlook.com|
      |havva@outlook.com|

  @account
      Scenario Outline: Data Driven Account Test "<name>"
        Given the user is on the login page
        When the user logs in using "<userType>" and "<password>"
        Then the user should be able to login and see message "<name>"
        Examples:
          |userType  |password|name|
          |eurotech@gmail.com |Test12345!|Eurotech|
          |oyku@gmail.com |oyku123!|oyku|
          |zehra@gmail.com |12345#|zehra|
          |havva@outlook.com |Havva123!|Havva|

