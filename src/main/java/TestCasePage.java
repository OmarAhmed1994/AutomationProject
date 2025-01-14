import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCasePage extends PageBase{
    public TestCasePage  (WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//*[@href=\"/test_cases\"]")
    public WebElement TCsEle;
    public void  TCsButton ()
    {
        Clicking(TCsEle);
    }

    @FindBy (xpath = "//*[@class='title text-center']/b")
    public WebElement TCsElement;
    public String testCasesText ()
    {
        return getText(TCsElement);
    }
}
