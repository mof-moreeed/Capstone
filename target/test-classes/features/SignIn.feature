Feature: Sign In Feature

  @signInSteps
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enters email 'mof_moreed@yahoo.com' and password 'Kabul@123'
    And User clicks on login button
    Then User should be logged in into Account

  @signUp
  Scenario: Verify user can create an acount into Retail website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name   | email                      | password  | confirmPassword |
      | Moreed | panthersxy661@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
