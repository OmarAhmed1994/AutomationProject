import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

public HomePage (WebDriver driver)
  {
    super(driver);
  }
   @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
   public WebElement signupLoginButtonElement ;
   public void clickOnSignupLoginButton()
   {
       Clicking(signupLoginButtonElement);
   }
}
