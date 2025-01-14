import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    protected WebDriver driver;

    //constractor


    public PageBase(WebDriver driver)
    {
       // this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public static void Clicking (WebElement element)
    {
        element.click();
    }


    public static void SendText (WebElement element , String text )
    {
        element.sendKeys(text);

    }

    public static String getText (WebElement element)
    {
        return element.getText();

    }

}
