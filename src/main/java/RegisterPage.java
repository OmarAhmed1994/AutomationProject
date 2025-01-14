import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {

    public RegisterPage (WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath = "//*[@name='name']")
    public WebElement nameElement;
    @FindBy (xpath = "(//*[@name='email'])[2]")
    public WebElement emailElement ;
    @FindBy (xpath = "(//*[@class='btn btn-default'])[2]")
    public WebElement Signup;

    @FindBy  (xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    public WebElement text;
    public String newSignUpText()
    {
        return getText(text);
    }

    public void sendValue(String fName, String email)
    {
       SendText(nameElement,fName);
       SendText(emailElement,email);
       Clicking(Signup);

    }

    @FindBy (xpath = "//*[@class='row']/div/div/h2/b")
    public WebElement text1;
    public String enterAccountInfo()
    {
     return getText(text1);
    }
    @FindBy (xpath = "//*[@id=\"id_gender1\"]")
    public WebElement genderMale;
    public void chooseGender ()
    {
        Clicking(genderMale);
    }

    @FindBy (xpath = ("//*[@id=\"password\"]"))
    public WebElement passwordEle;
    @FindBy (xpath = "(//*[@id=\"days\"]/option)[26]")
    public WebElement dayElement;
    @FindBy (xpath = "(//*[@id=\"months\"]/option)[8]")
    public WebElement monthElement;
    @FindBy(xpath = "(//*[@id=\"years\"]/option)[29]")
    public WebElement yearElement;
    @FindBy (xpath = "//*[@id=\"newsletter\"] ")
    public WebElement checkBoxElement;

    public void fillDetails(String password )
    {
    SendText(passwordEle,password);
    Clicking(dayElement);
    Clicking(monthElement);
    Clicking(yearElement);
    Clicking(checkBoxElement);
    }
    @FindBy (xpath = "//*[@id='first_name']")
    public WebElement fNameElement;
    @FindBy (xpath = "//*[@id='last_name'] ")
    public WebElement lNameElement;
    @FindBy (xpath = "//*[@id='company']")
    public WebElement companyElement;
    @FindBy (xpath = "//*[@id='address1']")
    public WebElement address1Element;
    @FindBy (xpath = "//*[@id='address2']")
    public WebElement address2Element;
    @FindBy (xpath = "(//*[@id='country']/option)[3]")
    public WebElement countryElement;
    @FindBy (xpath = "//*[@id='state']")
    public WebElement stateElement;
    @FindBy (xpath = "//*[@id='city']")
    public WebElement cityElement;
    @FindBy (xpath = "//*[@id='zipcode']")
    public WebElement postalElement;
    @FindBy (xpath = "//*[@id='mobile_number']")
    public WebElement mobileElement;
    @FindBy (xpath = "(//*[@class='btn btn-default'])[1]")
    public WebElement createElement;
    public void filedDetails (String fName, String lName, String company, String address1, String address2,String state, String city,String postal, String mobile)
    {
        SendText(fNameElement,fName);
        SendText(lNameElement,lName);
        SendText(companyElement,company);
        SendText(address1Element,address1);
        SendText(address2Element,address2);
        Clicking(companyElement);
        SendText(stateElement,state);
        SendText(cityElement,city);
        SendText(postalElement,postal);
        SendText(mobileElement,mobile);
        Clicking(createElement);
    }
     @FindBy (xpath = "//*[@class='title text-center']/b")
    public WebElement textElement;
    public String accountCreated()
    {
        return getText(textElement);
    }
    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement continueElement;
    public void continueButton ()
    {
        Clicking(continueElement);
    }
    @FindBy (xpath = "//*[@href='/delete_account']")
    public WebElement deleTextElement;

    public String AccountText () {
        return getText(deleTextElement);
    }
    @FindBy (xpath = "//*[@id='form']/div/div/div[3]/div/form/p")
    public WebElement  addressElement;
    public String EmailAddressAlreadyExist()
    {
        return getText(addressElement);
    }

}

