Feature: Retail Home Page

  
  Scenario: Verify Retail Page Logo
    Given User is on retail website
    Then User verify retail page logo is present
    
	
   Scenario: Verify User can Search in Electronics Department
   Given User is on retail website
   When User change the category to 'Electronics'
   And User search for an item 'PlayStation'
   And User clicks on Search icon
   Then Item should be present
   
   
   Scenario: Verify user can click on All Sections
   Given User is on retail website
   When user clicks on All sections
   Then User verifies 'Shop By department' is present
   
   
   Scenario: Verify Cart icon is present
   Given User is on retail website
   Then User verifies cart icon is present
   
   
   Scenario: 
   
   