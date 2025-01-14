import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class ProductPageTest extends TestBase{
    PageBase pageBase;
    HomePage homePage;
    ProductPage productPage;
    Actions actions;
    JavascriptExecutor js;
    @Test (priority = 1)
    public void productPage () throws InterruptedException {
        pageBase = new PageBase(driver);
        homePage =  new HomePage(driver);
        productPage = new ProductPage(driver);
        driver.get("http://automationexercise.com");
        String link = driver.getCurrentUrl();
        System.out.println(link);
        productPage.productButton();
        Thread.sleep(3000);
        String proLink = driver.getCurrentUrl();
        System.out.println(proLink);
        productPage.viewProductButton();
        String ProDetails = driver.getCurrentUrl();
        System.out.println(ProDetails);
        Thread.sleep(4000);
    }
    @Test (priority = 2)
    public void searchProduct ()
    {
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        driver.get("http://automationexercise.com");
        String link = driver.getCurrentUrl();
        System.out.println(link);
        productPage.productButton();
        productPage.searchProduct("Blue Top");
        productPage.submitEle.click();
        String text7 = productPage.searchedProductsText();
        System.out.println(text7);
    }
    @Test (priority = 3)
    public void SubscriptionInHomePage () throws InterruptedException {
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        driver.get("https://www.automationexercise.com/");
        driver.getCurrentUrl();
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,9000)");
        String text8 = productPage.SubscriptionText();
        System.out.println(text8);
        productPage.subscriptionText("omar11@gmail.com");
        productPage.arrowEle.click();
        Thread.sleep(3000);
    }
    @Test (priority = 4)
    public void SubscriptionInCartPage () throws InterruptedException {
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        driver.get("https://www.automationexercise.com/");
        String linkPage = driver.getCurrentUrl();
        System.out.println(linkPage);
        productPage.cartButton();
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        String text8 = productPage.SubscriptionText1();
        System.out.println(text8);
        productPage.subscriptionMail("omar6987@gmail.com");
        productPage.arrowElement.click();
        Thread.sleep(3000);
    }
    @Test (priority = 5)
    public void addProductsInCard () throws InterruptedException {
        pageBase = new PageBase(driver);
        homePage =  new HomePage(driver);
        productPage = new ProductPage(driver);
        actions = new Actions(driver);
        String String;
        driver.get("http://automationexercise.com");
        String link = driver.getCurrentUrl();
        System.out.println(link);
        productPage.productButton();
        //actions.moveToElement(productPage.addCardEle).perform();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        productPage.addCardButton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        productPage.clickOnViewCart();
        System.out.println(String = "Description = " + productPage.descriptionData());
        System.out.println(String = "Price = " + productPage.priceData());
        System.out.println(String = "Quantity = " + productPage.quantityData());
        System.out.println(String = "Total = " + productPage.totalData());
        Thread.sleep(5000);
    }
    @Test (priority = 6)
    public void productQuantityInCart () throws InterruptedException {
        pageBase = new PageBase(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        driver.get("http://automationexercise.com");
        String linkHome = driver.getCurrentUrl();
        System.out.println(linkHome);
        productPage.productButton();
        String proLink = driver.getCurrentUrl();
        System.out.println(proLink);
        productPage.viewProductButton();
        productPage.quantityCard("1");
        productPage.clickCardButton();
        System.out.println(productPage.verifyProductTextAdd());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        productPage.viewCardBut();
        productPage.proceedToCheckout();
    }



}
