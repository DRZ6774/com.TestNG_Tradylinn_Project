package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class GmailPage {

    public GmailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailSekmesi;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement sifre;

    @FindBy(xpath = "(//*[contains(text(),'Tradylinn')])[4]")
    public WebElement aktivasyonMaili;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/']")
    public  WebElement aktivasyonLinki;
}
