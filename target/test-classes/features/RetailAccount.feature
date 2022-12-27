Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enters email 'mof_moreed@yahoo.com' and password 'Kabul@123'
    And User clicks on login button
    Then User should be logged in into Account

  @updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Sahidi' and Phone '7031234522'
    And User click on Update button
    Then user profile information should be updated

  @updatePassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Kabul@123        | Kabul@1234  | Kabul@1234      |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @PaymentEntry
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard    | expirationMonth | expirationYear | securityCode |
      | 1234567890123452 | Moreed Sahidi |              12 |             26 |          123 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @PaymentUpdate
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0987654321123456 | Sahidi     |              10 |           2025 |          321 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @RemoveCard
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And User fill new address form with below information
      | country      | fullName  | phoneNumber | streetAddress      | apt      | city      | state      | zipCode      |
      | countryValue | nameValue | phoneValue  | streetAddressValue | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And User fill new address form with below information
      | country      | fullName  | phoneNumber | streetAddress      | apt      | city      | state      | zipCode      |
      | countryValue | nameValue | phoneValue  | streetAddressValue | aptValue | cityValue | stateValue | zipCodeValue |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
