package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoreManagerPage {

    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //MEHMET MAGDEN
    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/coupons/']")
    public WebElement kuponlarSekmesi;

    //DIRAZ
    @FindBy(xpath = "//input[@name='manage_stock']")
    public  WebElement manageStock;

    @FindBy(xpath = "//input[@name='stock_qty']")
    public WebElement stockQty;

    @FindBy(xpath = "(//a[@ href='https://tradylinn.com/store-manager/products-manage/10154'])[2]")
    public WebElement tshirt;

    @FindBy(xpath = "//input[@ type='submit']")
    public WebElement submitButonu;


       @FindBy(xpath = "//select[@ id='backorders'] ")
    public WebElement allowBackorders;
}
