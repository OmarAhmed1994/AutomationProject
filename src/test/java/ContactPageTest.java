import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class ContactPageTest extends TestBase {

    PageBase pageBase;
    HomePage homePage;
    CountactPage countactPage;
    @Test
    public void contactUs() throws InterruptedException {
       pageBase = new PageBase(driver);
       homePage = new HomePage(driver);
       countactPage =new CountactPage(driver);
       driver.get("https://www.automationexercise.com/");
       String URL = driver.getCurrentUrl();
       System.out.println(URL);
       countactPage.contactButton();
       String text6 = countactPage.GetInTouch();
       System.out.println(text6);
       countactPage.contactDetails("Omar", "omar12345@gmail.com", "Data", "How are you","C:\\Users\\omar.Abdelbaky\\Desktop\\Si Beta Issues.xlsx");
       Thread.sleep(3000);
       countactPage.submitButton();
       driver.switchTo().alert().accept();
       String text7= countactPage.verifyText();
        System.out.println(text7);
        Thread.sleep(4000);


    }




}
