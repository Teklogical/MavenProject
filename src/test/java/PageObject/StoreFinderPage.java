package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreFinderPage extends BasePage  {

	public StoreFinderPage(WebDriver driver) {
	
	 super(driver);
	 
	}


	@FindBy(how=How.XPATH, using="//a[@class='TaskLinks__link'][contains(text(),'Store Finder")
	public static WebElement link_storefinder;
	
	
	@FindBy(how=How.ID, using="storeSearchBox")
	public static WebElement storeSearchBox ;

	@FindBy(how=How.XPATH, using="//button[@class='bttn bttn--primary bttn--noShadow']//span[@class='bttn__content bttn__content--noicon']")
	public static WebElement btn_searchbutton;
	

}

