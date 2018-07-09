Feature: Searchfunction
  

  @Searchitem1
  Scenario: SearchItem1
    Given Input 'Hammer' in search bar
    And Click search button
    When Verify 'Husky_16_oz. Fiberglass_Claw_Hammer' is displayed
    And Click add to cart button of "Husky_16oz"
    And Click close button in add to cart window
    Then go back to homepage
    And verify  selected items in cart is displayed

  @Searchitem2
  Scenario: SearchItem2
    Given Input 'Bug_Spray' in search bar
    When click searh button
    Then  verify 'Repel 6.5 oz. Aerosol Sportsmen Max Insect Repellent' is displayed
    Then go back to home page
 