
Feature: the user should be able to edit profile
  Background: 
    Given the user is on the login page
    @edit
    Scenario Outline: edit profile
      When the user logs in using "<email>" and "<password>"
      And the user navigates to "<add info module>"
      And the user select "status" "<status>"
      And the user add "company" "<company info>"
      And the user add "website" "<website info>"
      And the user add "location" "<location info>"
      And the user add "skills" "<skills>"
      And the user add "githubusername" "<githubusername>"
      And the user add "bio" "<bio>"
      Then the user enters submit button
      Examples:
      |email|password|add info module|status|company info|website info|location info|skills|githubusername|bio|
      |eurotech@gmail.com|Test12345!|Edit Profile|Instructor|euroTech Study|http://eurotech.study/|Germany|Java,Selenium, Cucumber,Junit, Github|eurotech-sdet|SDET programme|
      |zehra@gmail.com|12345#| Edit Profile| Junior Developer | euroTech Studyo| https://www.eurotechstudy.com/|London| Java,Selenium,Cucumber,testNG,Github, Jira| euroTech-sdet| Developer programme|