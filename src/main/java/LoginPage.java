import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

   public LoginPage (WebDriver driver)
   {
       super(driver);
   }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginElement;
   public void loginClick()
   {
       Clicking(loginElement);
   }

   @FindBy (xpath = "//*[@class=\"login-form\"]/h2")
    public WebElement loginTextElement;
   public String loginToYourAccount()
   {
       return getText(loginTextElement);
   }
   @FindBy (xpath = "(//*[@name='email'])[1]")
    public WebElement mailElement;
   @FindBy (xpath = "(//*[@name='password'])[1]")
    public WebElement passElement;
   @FindBy (xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement loginEle;

   public void loginInfo (String mailEle, String passEle)
   {
       SendText(mailElement,mailEle);
       SendText(passElement,passEle);
       Clicking(loginEle);
   }

   @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    public WebElement loginTextEle;


   public String LoggedInAsUserName()
   {
       return getText(loginTextEle);
   }

   @FindBy (xpath = "//*[@href='/delete_account']")
    public WebElement DelElement;
   public void deleteAccount ()
   {
        Clicking(DelElement);
   }

   @FindBy (xpath = "//*[@class='title text-center']/b")
   public WebElement AccElement;
   public String accountDeleted()
   {
       return getText(AccElement);
   }
   @FindBy (xpath = "//*[@id='form']/div/div/div[1]/div[1]/form/p")
    public WebElement messageEle;
    public String yourEmailOrPasswordIsIncorrect()
   {
       return getText(messageEle);
   }

   @FindBy (xpath = "//a[@href='/logout']")
    public WebElement logoutElement;
    public void logoutButton()
    {
        Clicking(logoutElement);
    }



}

