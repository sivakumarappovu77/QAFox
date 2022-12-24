#Author: Sivakumar
#Webpage:Tutorilsninja
#Senario: Register to page
@tag
Feature: TutorialsNinja
  

  @tag1
  Scenario: Registering to TutorialsNinja
    Given Open Browser "http://tutorialsninja.com/demo/"
    And Click on MyAccount
    When Click on Register
    Then Give FirstName and LastName
    Then Give Email
    Then Give Telephone_Number
    And Give Password and conform_Password
    Then Select Subscribe
    Then Select Agree_Box
    And Click_Continue
    
 
      
    
 

