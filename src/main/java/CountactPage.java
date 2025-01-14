import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountactPage extends PageBase{

    public CountactPage(WebDriver driver)

    {
        super(driver);
    }
    @FindBy (xpath = "//*[@href='/contact_us']")
    public WebElement contactElement;
    public void contactButton () {
        Clicking(contactElement);
    }
    @FindBy (xpath = "(//*[@class='title text-center'])[2]")
    public WebElement textEle;
    public String GetInTouch ()
    {
        return getText(textEle);
    }
    @FindBy (xpath = "//*[@name='name']")
    public WebElement nameEle;
    @FindBy (xpath = "//*[@name='email']")
    public WebElement emailEle;
    @FindBy (xpath = "//*[@name='subject']")
    public WebElement subjectEle;
    @FindBy (xpath = "//*[@id='message']")
    public WebElement messageEle;
    @FindBy (xpath = "/html/body/div[1]/div[2]/div[1]/div/div[3]/form/div[5]/input")
    public WebElement fileEle;

    public void contactDetails (String name, String email, String subject, String message, String path)
    {
        SendText(nameEle,name);
        SendText(emailEle,email);
        SendText(subjectEle,subject);
        SendText(messageEle,message);
        SendText(fileEle,path);

    }
    @FindBy (xpath = "//*[@class='btn btn-primary pull-left submit_form']")
    public WebElement submitEle;

    public void submitButton ()
    {
        Clicking(submitEle);
    }
    @FindBy (xpath = "//*[@class='status alert alert-success']")
    public WebElement verifyEle;
    public String verifyText ()
    {
        return getText(verifyEle);

    }








}
