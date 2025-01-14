import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCasePageTest extends TestBase {
    PageBase pageBase;
    HomePage homePage;
    TestCasePage testCasePage;

    @Test (priority = 1)
    public void testCases ()
    {
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        testCasePage= new TestCasePage(driver);
        driver.get("https://www.automationexercise.com");
        driver.getCurrentUrl();
        testCasePage.TCsButton();
        String TcsPage = driver.getCurrentUrl();
        System.out.println(TcsPage);

    }
    @Test (priority = 2)
            public void validText()
    {
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        testCasePage= new TestCasePage(driver);
        driver.get("https://www.automationexercise.com");
        driver.getCurrentUrl();
        testCasePage.TCsButton();
        System.out.println(testCasePage.testCasesText());
    }

}
