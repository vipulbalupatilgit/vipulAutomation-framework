#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@exam
  #Scenario: MyLogin
    #Given Login to top hire
    #And veriify homepage
Feature: Login Functionality

  @tags
  Scenario: Successful login
    Given User is on login page
    When User enters valid credentials
    Then User should see the dashboard