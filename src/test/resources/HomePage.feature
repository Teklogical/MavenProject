
Feature: HomePageVerify
  

  @Open
  Scenario: OpenBrowser
    Given Open browser
    And get to "homedepoit.com"
    When maximum the window
    

  @Homepageverification
  Scenario Outline: HomePageVerification
    Given verify Homedepot logo is displayed
    When 
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
