Feature: Team B TestCase Steps

  Scenario: Step ID till End
    Given OpenBrowserToHomeDepot
    When Verify HomeDepot Logo
    When Verify Search Webedit field and Show DisPlayed
    When Verify What Can I help you to find today? text is DisPlayed inside of the search webedit field
    When Enter Hammer in search webedit field and Click SearchButton
    When Click Add to Cart Webbutton
    When Close one Item Added to Cart window and Show CLOSED
    When Verify Selected items in cart is displayed in the home page
    When Click BackButton
    When Enter Bug Spray in search webedit field and Click SearchButton
    When Click BackButton
    When Click on My Account WebElement
    When Verify Shopping cart for selected items for sale and show DisPlayed
    When Click on Link Store Finder
    When Enter Postal Zip code in web edit field and click search button
    When Customer is able to click All Departments Link
    Then Close and Quit Browser
