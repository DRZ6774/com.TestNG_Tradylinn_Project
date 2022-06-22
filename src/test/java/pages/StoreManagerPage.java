package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class StoreManagerPage {

    public StoreManagerPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //MEHMET MAGDEN
    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/coupons/']")
    public WebElement kuponlarSekmesi;
}
