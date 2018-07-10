package StepDefinition;

public class StoreFinderSteps {
	
	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	 

	import PageObject.StoreFinderPage;

	import cucumber.api.java.en.Given;

	import cucumber.api.java.en.Then;

	import cucumber.api.java.en.When;

	 

	public class StoreFinderSteps {

	    WebDriver driver;

 @Given("^Verify \"([^\"]*)\" in home page$")

 public void verify_in_home_page(String arg1) throws Throwable {
	 if(StoreFinderPage.link_storefinder.isDisplayed()) {
	 System.out.println(" StoreFinder link is Displayed");
	 }
	 else {
	        System.out.println("StoreFinder link is Not Displayed");
	 }            
 }	
	 @Given("^Click store finder$")

	 public void click_store_finder() throws Throwable {

	  StoreFinderPage.link_storefinder.click();
	  Thread.sleep(3000);}

	  @When("^Input \"([^\"]*)\" in location search bar$")
	  public void input_in_location_search_bar(String arg1) throws Throwable {

	 StoreFinderPage.storeSearchBox.sendKeys("22556");
	  }
	 @When("^Click location search button$")

	  public void click_location_search_button() throws Throwable {

	   StoreFinderPage.btn_searchbutton.click();
	                }
	   @When("^Verify \"([^\"]*)\" is displayed$")

	   public void verify_is_displayed(String arg1) throws Throwable {

	   boolean isDisplayed10 =driver.findElement(By.xpath("//a[@href='/l/Stafford/VA/Stafford/22556/4637']//h1[@class='sfstorename']")).isDisplayed();    

	   if(isDisplayed10) {

	    System.out.println("1 - Stafford #4637\n" +"Open until 10:00 p.m.\n" +"0.00 mi\n" +"305 Worth Road\n" +"Stafford, VA 22556\n" +"Store: (540) 657-6478\n" +"Tool and Truck Rental: (540) 288-3410\n" +"Pro Desk: (540) 288-3404 is displayed");

	  }else {

	    System.out.println("1 - Stafford #4637\n" +"Open until 10:00 p.m.\n" +"0.00 mi\n" +"305 Worth Road\n" +"Stafford, VA 22556\n" +"Store: (540) 657-6478\n" +"Tool and Truck Rental: (540) 288-3410\n" +"Pro Desk: (540) 288-3404 is not displayed");

	       }

	       }
	    @Then("^Go back to home page$")

	   public void go_back_to_home_page() throws Throwable {

	   driver.navigate().to( "https://www.homedepot.com");
	 
}
}