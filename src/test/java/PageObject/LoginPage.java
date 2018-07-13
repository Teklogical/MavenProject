package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

              WebDriver driver;

              public LoginPage(WebDriver driver) {
                           super(driver);
              }

              @FindBy(className = "Header3__groupItem Header3__groupItem--center")
              WebElement My_account_button;

              @FindBy(className = "bttn__content")
              WebElement Sign_in_button1;

              @FindBy(id = "email_id")
              WebElement username;

              @FindBy(id = "password")
              WebElement password;

              @FindBy(id = "accountSignIn")
              WebElement Sign_in_button2;

}