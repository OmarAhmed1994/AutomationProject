import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class RegisterPageTest extends TestBase {

    PageBase pageBase;
    RegisterPage registerPage;
    SoftAssert softAssert;
    HomePage homePage;


    @Test (priority = 1)
    public void Register () throws InterruptedException {
        pageBase = new PageBase(driver);
        registerPage = new RegisterPage(driver);
        homePage= new HomePage(driver);
        softAssert = new SoftAssert();
        driver.get("https://www.automationexercise.com/");
        String homePageLink = driver.getCurrentUrl();
        softAssert.assertEquals(homePageLink, "https://www.automationexercise.com/");
        homePage.clickOnSignupLoginButton();
        String text = registerPage.newSignUpText();
        softAssert.assertEquals(text, "New User Signup!");
        System.out.println(text);
        registerPage.sendValue("Omar", "omaraabdelba95@gmail.com" );
        String text1 = registerPage.enterAccountInfo();
        softAssert.assertEquals(text1,"Enter Account Information");
        System.out.println(text1);
        registerPage.genderMale.click();
        registerPage.fillDetails( "123456GG");
        registerPage.filedDetails("omar","Abdelbaky","Z2Data","Benha","Benha1","Qulibya","benha","11631","01229828811");
        String text2 =registerPage.accountCreated();
        softAssert.assertEquals(text2,"Account Created!");
        System.out.println(text2);
        registerPage.continueButton();
        registerPage.AccountText();
        String tes = registerPage.AccountText();
        System.out.println(tes);
        Thread.sleep(3000);


    }
    @Test (priority = 2)
    public void RegisterUserWithExistingEmail ()
    {
        registerPage =new RegisterPage(driver);
        pageBase = new PageBase(driver);
        homePage= new HomePage(driver);
        driver.get("https://www.automationexercise.com/");
        String homeLink= driver.getCurrentUrl();
        System.out.println(homeLink);
        homePage.clickOnSignupLoginButton();
        String NewTxt = registerPage.newSignUpText();
        System.out.println(NewTxt);
        registerPage.sendValue("omar","omaraabdelb997@gmail.com");
        String gotText = registerPage.EmailAddressAlreadyExist();
        System.out.println(gotText);
    }


    }

