Feature: Searchfunction
  

  @Searhitem1
  Scenario: SearchItem1
    Given Input "Hammer" in search bar
    And Click search button
    When Verify "Husky 16 oz. Fiberglass Claw Hammer" is displayed
    And Click add to cart button
    And Click close button in add to cart window
    Then go back to homepage
    And verify  selected items in cart is displayed

  @Seachitem2
  Scenario Outline: SearchItem2
    Given Input "Bug Spray" in search bar
    When click searh button
    Then  verify "Repel 6.5 oz. Aerosol Sportsmen Max Insect Repellent" is displayed
    Then go back to home page
 