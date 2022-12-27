Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enters email 'mof_moreed@yahoo.com' and password 'Kabul#123'
    And User clicks on lonin button
    Then User should be logged in into Account

  
  Scenario Outline: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enters email <email> and password <password>
    And User clicks on lonin button
    Then User should be logged in into Account

    Examples: 
      | email                      | password    |
      | 'mof_moreed@yahoo.com'     | 'Kabul#123' |
      | 'morid_sahidi@hotmail.com' | 'Kabul#123' |
	
	
  Scenario: Verify user can create an acount in the Retail website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email          | password  | confirmPassword |
      | Moreed | moreed2@tek.com | Kabul#123 | Kabul#123       |
    And User click on SignUp button
    Then User should be logged into account page
