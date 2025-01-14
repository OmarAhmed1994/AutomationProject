import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends TestBase {
    PageBase pageBase;
    HomePage homePage;
    SoftAssert softAssert;
    LoginPage loginPage;

    @Test (priority = 1)
    public void loginPageTest ()
    {
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        softAssert = new SoftAssert();
        loginPage = new LoginPage(driver);
        driver.get("http://automationexercise.com");
        String loginPageLink = driver.getCurrentUrl();
        loginPage.loginClick();
        loginPage.loginToYourAccount();
        String Text = loginPage.loginToYourAccount();
        System.out.println(Text);
        loginPage.loginInfo("omaraabdelba93@gmail.com","123456GG");
        loginPage.loginEle.click();
        loginPage.LoggedInAsUserName();
        String text3 = loginPage.LoggedInAsUserName();
        System.out.println(text3);
        loginPage.deleteAccount();
        loginPage.accountDeleted();
        String Text4 = loginPage.accountDeleted();
        System.out.println(Text4);

    }
    @Test (priority = 2)

    public void loginInvalidData () {
        loginPage = new LoginPage(driver);
        driver.get("https://www.automationexercise.com/");
        String homePage = driver.getCurrentUrl();
        loginPage.loginClick();
        loginPage.loginToYourAccount();
        String text5 = loginPage.loginToYourAccount();
        System.out.println(text5);
        loginPage.loginInfo("omar12345@gmail.com","147852");
        loginPage.loginEle.click();
        loginPage.yourEmailOrPasswordIsIncorrect();
        String errorMes = loginPage.yourEmailOrPasswordIsIncorrect();
        System.out.println(errorMes);
    }
    @Test (priority = 3)
    public void logoutUser()
    {
        loginPage = new LoginPage(driver);
        driver.get("https://www.automationexercise.com/");
        String homePage = driver.getCurrentUrl();
        loginPage.loginClick();
        loginPage.loginToYourAccount();
        String text5 = loginPage.loginToYourAccount();
        System.out.println(text5);
        loginPage.loginInfo("omaraabdelb997@gmail.com","123456GG");
        loginPage.loginEle.click();
        //loginPage.LoggedInAsUserName();
        String Mess= loginPage.LoggedInAsUserName();
        System.out.println(Mess);
        loginPage.logoutButton();
        String loginPage = driver.getCurrentUrl();
        System.out.println(loginPage);
    }


}

