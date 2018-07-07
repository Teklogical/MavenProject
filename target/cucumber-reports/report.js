$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/84128/git/MavenProject/src/test/resources/CaseTest.Feature");
formatter.feature({
  "line": 1,
  "name": "Team B TestCase Steps",
  "description": "",
  "id": "team-b-testcase-steps",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Step ID till End",
  "description": "\n\nGiven: Open Browser and show DisPlayed\nWhen: Type URL as \"www.homedepot.com\" and show DisPlayed\nWhen: Verify HomeDepot Logo and show DisPlayed\nWhen: Verify Search Webedit field and Show DisPlayed\nWhen: Verify \"What Can I help you to find today?\" text is DisPlayed inside of the search webedit field\nWhen: Enter \"Hammer\" in search webedit field and Click SearchButton\nWhen: Click \"Add to Cart\" Webbutton\nWhen: Close 1 Item Added to Cart window and Show CLOSED\nWhen: Verify Selected items in cart is displayed in the home page\nWhen: Click BackButton\nWhen: Enter Bug Spray in search webedit field and Click Search Button\nWhen: Click BackButton\nWhen: Click on \"My Account\" WebElement\nWhen: Verify Shopping cart for selected items for sale and show DisPlayed\nWhen: Click on Link \"Store Finder\"\nWhen: Enter Postal Zip code in web edit field and click search button\nWhen: Customer is able to click All Departments Link\nThen: Close and Quit Browser",
  "id": "team-b-testcase-steps;step-id-till-end",
  "type": "scenario",
  "keyword": "Scenario"
});
});