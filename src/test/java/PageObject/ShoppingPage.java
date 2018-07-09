package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class ShoppingPage extends BasePage {
	 public ShoppingPage(WebDriver driver) {
	        super(driver);
	}
	 
	 
	 @FindBy(how = How. XPATH, using = "//*[@id=\"headerSearch\"]")
	 public static WebElement SearchBar;	 
	 
	 
	 
	 @FindBy(how = How. XPATH, using = "//*[@id=\"headerSearchButton\"]")
	 public static WebElement SearchBtn;
	 
	 
	 @FindBy(how = How. XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div/div/div[1]/div/div[3]/div[1]/a")
	 public static WebElement Husky16oz;
	 
	 
	 @FindBy(how = How. XPATH, using = "//span[contains(.,'Add to Cart')]")
	 public static WebElement AddtoCartBtn;
	 
	 
	 @FindBy(how = How. XPATH, using = "//iframe[@src and contains(@class,'thd-overlay-frame')]")
	 public static WebElement IframeXpath;
			
	 
	 
	 
	 @FindBy(how = How. XPATH, using = "//a[@data-automation-id='headerDesktopCloseAddToCartOverlay']")
	 public static WebElement ClsBtnOfIframe;
	 
	 
	 @FindBy(how = How. CLASS_NAME, using = "MyCart__itemCount")
	 public static WebElement IteminMycart;
	 
	 
	 @FindBy(how = How. XPATH, using = "//a[@data-pos='0']")
	 public static WebElement RepelInsectRepellent;
	 
	 
	 @FindBy(how = How. XPATH, using = "//*[@class='HeaderLogo']")
	 public static WebElement HomeDepotLogoBtn;
}
