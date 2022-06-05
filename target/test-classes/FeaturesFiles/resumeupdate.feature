
@tag
Feature: Title of your feature
  I want to use this template for my feature file
Background: user is login
 Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
    Then success message is displayed
    
 @updateResume
  Scenario: update resume
    Then click on my naukri
    And  click on edit profile
    Then click on update resume

