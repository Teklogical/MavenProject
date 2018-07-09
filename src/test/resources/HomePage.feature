
Feature: Homepage automation
  

  @Openapp
  Scenario: OpenApp
    Given Open Browser
    When Get to 'homedepot.com'
    Then verify HomeDepot logo is displayed
    Then verify Search bar is displayed
    Then verify 'Wht can I help you to find today?' text is displayed inside of the search bar


  @VerifyHomePage
  Scenario: VerifyHomePage
    Given verify Appliances is clickable
    When verify Bath & Faucets is lick bale
    Then verify Blinds & Window Treatments
    Then verify Building Materials
    Then verify Decor & Furniture
    Then verify Doors & Windows
    Then verify Electrical
    Then verify Flooring & Area Rugs
        Then verify Hardware
            Then verify Heating & Cooling
            Then verify Kitchen & Kitchenware
            Then verify Lawn & Garden
            Then verify Lighting & Ceiling Fans
            Then verify Outdoor Living
            Then verify Paint
            Then verify Plumbing
            Then verify Storage & Organization
            Then verify Tools 
            
            
             @Myaccount
  Scenario: Veriyfy My Account bar
    Given Verify Sign in button is displayed
    And Verify Register button is displayed
    When Verify Orders & Purchases is displayed
    And Verify My Credit Card Account is displayed
    And Verify Account Profile is displayed
    Then Verify Favorites is displayed
    And Verify Find a Listis displayed
    And Verify My Subscriptions links are displayed displayed
            