package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KuponPage {

    public KuponPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    //MEHMET MAGDEN
    @FindBy (xpath = "//*[text()='Yeni ekle']")
    public WebElement yeniEkleButton;

    @FindBy (xpath = "//input[@id='title']")
    public  WebElement kuponTitle;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement kuponSubmitButton;

    @FindBy (xpath = "//*[@id=\"wcfm_coupon_manager_submit\"]")
    public  WebElement CouponSuccesfullyPublishedText;

    @FindBy (xpath = "//input[@id='customer_email']")
    public WebElement emailRestrictionsTextBox;

    @FindBy (xpath = "//a[text()='Deneme123']")
    public WebElement hazirKuponDeneme123;

    @FindBy (xpath = "//textarea[@id='description']")
    public WebElement descriptionTextBox;

    @FindBy(xpath = "//select[@id='discount_type']")
    public WebElement discountTypeDropBox;



}
