import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
    public static WebDriver driver;

    @BeforeSuite
    public void Setup()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("https://www.automationexercise.com/");
    }




    @AfterSuite
    public void quit()
    {
        driver.quit();
    }

}
