package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingPage extends BasePage  {
	
    public ShoppingPage(WebDriver driver) {
        super(driver);
}

@FindBy(how = How.XPATH, using = "//*[@id=\"headerSearch\"]")
public static WebElement SearchBox;

@FindBy(how = How.XPATH, using = "//*[@id=\"headerSearchButton\"]")
public static WebElement SearchButton;

@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div/div[1]/div[5]/div[2]/div[2]/div[1]/div[1]/div/div/div[1]/div/div[4]/div[3]/div/a/span")
public static WebElement AddToCart;

@FindBy(how = How.CLASS_NAME, using = "thd-overlay-frame")
public static WebElement iframe;

}


