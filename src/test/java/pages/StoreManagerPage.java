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
    @FindBy(xpath = "//span[@ class='wcfmfa fa-database']")
    public  WebElement stockManagerSekmesi;

    @FindBy(xpath = "(//input[@ type='number'])[1]")
    public WebElement stockQuantity;

    @FindBy(xpath = "(//select[@ class='wcfm-select'])[2]")
    public WebElement backordersAlani;
}
