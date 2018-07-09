package StepsTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import PageObject.BasePage;
import PageObject.ShoppingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchShoppingStep {
	@Given("^Input 'Hammer' in search bar$")
	public void input_Hammer_in_search_bar() throws Throwable {
	   ShoppingPage.SearchBar.sendKeys("Hammer");
	}

	@Given("^Click search button$")
	public void click_search_button() throws Throwable {
	 ShoppingPage.SearchBtn.click();
	}

	@When("^Verify 'Husky_(\\d+)_oz\\. Fiberglass_Claw_Hammer' is displayed$")
	public void verify_Husky___oz_Fiberglass_Claw_Hammer_is_displayed(int arg1) throws Throwable {
		 if(ShoppingPage.Husky16oz.isDisplayed() )      
	        {
	             System.out.println("'Husky 16 oz. Fiberglass Claw Hammer' displayed.");
	        }
	        else
	        {
	            System.out.println("'Husky 16 oz. Fiberglass Claw Hammer' not displayed.");
	        }
	}

	@When("^Click add to cart button of \"([^\"]*)\"$")
	public void click_add_to_cart_button_of(String arg1) throws Throwable {
		ShoppingPage.AddtoCartBtn.click();
	}

	@When("^Click close button in add to cart window$")
	public void click_close_button_in_add_to_cart_window(WebDriver driver) throws Throwable {
          driver.switchTo().frame(ShoppingPage.IframeXpath);
		ShoppingPage.ClsBtnOfIframe.click();
	}

	@Then("^go back to homepage$")
	public void go_back_to_homepage() throws Throwable {
	   ShoppingPage.HomeDepotLogoBtn.click();
	}

	@Then("^verify  selected items in cart is displayed$")
	public void verify_selected_items_in_cart_is_displayed() throws Throwable {
		String quantity =
	    		ShoppingPage.IteminMycart.getText();
	    		        int n = Integer.parseInt(quantity);
	    		        if(n==1) {
	    		                System.out.println("1 item is selected");
	    		        }else {
	    		                System.out.println("Check the cart");
	    		        }
	}

	@Given("^Input 'Bug_Spray' in search bar$")
	public void input_Bug_Spray_in_search_bar() throws Throwable {
		ShoppingPage.SearchBar.clear();
	    ShoppingPage.SearchBar.sendKeys("Bug Spray");
	}

	@When("^click searh button$")
	public void click_searh_button() throws Throwable {
	   ShoppingPage.SearchBtn.click();
	}

	@Then("^verify 'Repel (\\d+)\\.(\\d+) oz\\. Aerosol Sportsmen Max Insect Repellent' is displayed$")
	public void verify_Repel_oz_Aerosol_Sportsmen_Max_Insect_Repellent_is_displayed(int arg1, int arg2) throws Throwable {
		 if(ShoppingPage.RepelInsectRepellent.isDisplayed() )      
	        {
	             System.out.println("''Repel 6.5 oz. Aerosol Sportsmen Max Insect Repellent' is displayed.");
	        }
	        else
	        {
	            System.out.println("'Repel 6.5 oz. Aerosol Sportsmen Max Insect Repellent' is not displayed.");
	        }
	}

	@Then("^go back to home page$")
	public void go_back_to_home_page() throws Throwable {
		  ShoppingPage.HomeDepotLogoBtn.click();
	}
}
