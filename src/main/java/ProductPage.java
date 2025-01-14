import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase {
    public  ProductPage (WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath = "//a[@href='/products']")
    public WebElement ProEle;
    public void productButton()
    {
        Clicking(ProEle);
    }
    @FindBy (xpath = "//a[@href='/product_details/1']")
    public WebElement viewElement;
    public void viewProductButton()
    {
        Clicking(viewElement);
    }
    @FindBy (xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
    public WebElement addCardEle;
    public void addCardButton()
    {
        Clicking(addCardEle);
    }

    @FindBy (xpath = "//*[@href='/view_cart']/u")
    public WebElement viewButtonEle;
    public void clickOnViewCart ()
    {
        Clicking(viewButtonEle);
    }
    @FindBy (xpath = "//*[@href='/product_details/1']")
    public WebElement desElement;
    public String descriptionData ()
    {
        return getText(desElement);
    }

    @FindBy (xpath = "//*[@class='cart_price']/p")
    public WebElement priceElement;
    public String priceData ()
    {
        return getText(priceElement);
    }

    @FindBy (xpath = "//*[@class='cart_quantity']/button")
    public WebElement quantityElement;
    public String quantityData ()
    {
        return getText(quantityElement);
    }

    @FindBy (xpath = "//*[@class='cart_total_price']")
    public WebElement totalElement;
    public String totalData ()
    {
        return getText(totalElement);
    }


    @FindBy (xpath = "//*[@id='search_product']")
    public WebElement searchEle;
    @FindBy (xpath = "//*[@id='submit_search']")
    public WebElement submitEle;
    public void searchProduct (String product)
    {
        SendText(searchEle,product);
        Clicking(submitEle);
    }

    @FindBy (xpath = "//*[@class='title text-center']")
    public WebElement searchTextEle;
    public String searchedProductsText ()
    {
        return getText(searchTextEle);
    }

    @FindBy (xpath = "//*[@class='single-widget']/h2")
    public WebElement subscriptionEle;

    public  String SubscriptionText()
    {
       return getText(subscriptionEle);
    }
    @FindBy (xpath = "//*[@id='susbscribe_email']")
    public WebElement subEmailEle;
    @FindBy (xpath = "//*[@id='subscribe']")
    public WebElement arrowEle;
    public void subscriptionText (String email)
    {
        SendText(subEmailEle,email);
        Clicking(arrowEle);
    }
    @FindBy (xpath = "//a[@href='/view_cart']")
    public WebElement cardButtonElement;
    public void cartButton ()
    {
        Clicking(cardButtonElement);
    }
    @FindBy (xpath = "//div[@class='single-widget']/h2")
    public WebElement subTextElement;
    public String SubscriptionText1 ()
    {
        return getText(subTextElement);
    }
    @FindBy (xpath = "//*[@id='susbscribe_email']")
    public WebElement subMail;
    @FindBy (xpath = "//*[@id='subscribe']")
    public WebElement arrowElement;
    public void subscriptionMail (String gmail)
    {
        SendText(subMail, gmail);
        Clicking(arrowElement);
    }
    @FindBy (xpath = "//*[@id='quantity']")
    public WebElement quantityEle;
    public void quantityCard (String quantity)
    {
        SendText(quantityEle,quantity);
    }

    @FindBy (xpath = "//*[@class='btn btn-default cart']")
    public WebElement cardEle;

    public void clickCardButton()
    {
        Clicking(cardEle);
    }

    @FindBy (xpath = "(//*[@class='text-center'])[1]")
    public WebElement productTextEle;
    public String verifyProductTextAdd()
    {
        return getText(productTextEle);
    }
    @FindBy (xpath = "//*[@class='text-center']/a")
    public WebElement viewCardEle;
    public void viewCardBut ()
    {
        Clicking(viewCardEle);

    }
    @FindBy (xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedEle;
    public void proceedToCheckout ()
    {
        Clicking(proceedEle);
    }




}
