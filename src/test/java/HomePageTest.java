import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends TestBase
{
    HomePage homePage;
    LoginPage loginPage;
    PageBase pageBase;
    @Test
    public void HomePageTest() throws InterruptedException {
        homePage = new HomePage(driver);
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        driver.get("http://automationexercise.com");
        homePage.clickOnSignupLoginButton();
    }
}
