
Feature: HomePageVerify
  

  @Open
  Scenario: OpenBrowser
    Given Open browser
    And get to "homedepoit.com"
    When maximum the window
    

  @Homepageverification
  Scenario: HomePageVerification
    Given verify Homedepot logo is displayed
    When verify search bar is displayed
    Then Verify "What Can I help you to find today?" text is displayed inside of the search bar

@Homepagefunction
Scenario: HomePageFuncitonCheck
   Given Appliances is clickable
Then Bath & Faucets is clickable
Then Blinds & Window Treatments is clickable
Then Decor & Furniture
Then Doors & Windows