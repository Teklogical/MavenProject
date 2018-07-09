
Feature: Storefinderpage
  I want to use this template for my feature file

  @Storefinder
  Scenario: Veryfy store finder page
    Given Verify "Store Finder" in home page
    And Click store finder
    When Input "22556" in location search bar
    And Click location search button
    And Verify "Stafford #4637" is displayed
    Then Go back to home page
   
