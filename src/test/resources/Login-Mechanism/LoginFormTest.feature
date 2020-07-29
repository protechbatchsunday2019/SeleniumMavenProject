Feature: Multicart Login Form Validation
  As a user of Multicard 
  I want to see a login for 
  So I can start thinking of login to the syetem

  Scenario: User can see the Login Form
    Given I browse to https://www.demo.iscripts.com/multicart/demo/index.php
    Then I expect a login form with ID Password & login button exist

  #Scenario: User can see the Sign Up Option
    #Given I browse to https://www.demo.iscripts.com/multicart/demo/index.php
    #Then I expect a signUp option available inside login form
#
  #Scenario: User can see forgot password link
    #Given I browse to https://www.demo.iscripts.com/multicart/demo/index.php
    #Then I expect a forgotpassword link option available inside login form
