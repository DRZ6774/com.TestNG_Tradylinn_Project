package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class RegistrationPage {

    public  RegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement emailSekmesi;

    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement passwordSekmesi;

    @FindBy(xpath = "//input[@id='confirm_pwd']")
    public WebElement confirmPasswordSekmesi;

    @FindBy(xpath = "//input[@name='save-data']")
    public  WebElement registerButonu;

    @FindBy(xpath="//div[@class='wcfm_membership_thankyou_content']")
    public  WebElement aktivasyonMailiMesajı;




}
