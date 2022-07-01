package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GeriOdemePage {
    public GeriOdemePage(){PageFactory.initElements(Driver.getDriver(),this);}

    //DIRAZ
    @FindBy(xpath = "(//span[@ class='text'])[8]")
    public WebElement geriOdmeSekmesi;

    @FindBy(xpath = "//select[@ name='status_type'] ")
    public WebElement requestedAramaButonu;

    @FindBy(xpath = "(//th [@class='sorting_disabled'])[1]")
    public WebElement requestID;

    @FindBy(xpath = "(//th [@class='sorting_disabled'])[2]")
    public WebElement orderID;

    @FindBy(xpath = "(//th [@class='sorting_disabled'])[3]")
    public WebElement amount;

    @FindBy(xpath = "(//th [@class='sorting_disabled'])[4]")
    public WebElement type;

    @FindBy(xpath = "(//th [@class='sorting_disabled'])[5]")
    public WebElement reason;

    @FindBy(xpath = "//span[@ class='wcfm_dashboard_item_title']")
    public WebElement requestIDDegeri;

    @FindBy(xpath = "(//a[@ target='_blank'])[4]")
    public WebElement OrderIDDegeri;

    @FindBy(xpath = "(//span[@ class='woocommerce-Price-amount amount'])[5]")
    public WebElement AmountDegeri;

    @FindBy(xpath = "//tr//td[5]")
    public WebElement TypeDegeri;

    @FindBy(xpath = "//tr//td[6]")
    public WebElement ReasonDegeri;

}
