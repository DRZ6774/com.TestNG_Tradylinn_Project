package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class RegistrationPage {

    public HTMLInputElement homePageGirisYapSekmesi;
    public Alert kullaniciAdiTextBox;
    public Alert kullaniciSifresiTextBox;
    public HTMLInputElement girisYapButton;

    public  RegistrationPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = ("//input[@id='user_email']"))
    public WebElement emailSekmesi;

    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement passwordSekmesi;

    @FindBy(xpath = "//input[@id='confirm_pwd']")
    public WebElement confirmPasswordSekmesi;

    @FindBy(xpath = "//input[@name='save-data']")
    public  WebElement registerButonu;

    @FindBy(xpath="//div[@class='wcfm_membership_thankyou_content']")
    public  WebElement aktivasyonMailiMesajı;

@FindBy(xpath="//p[text()='Wrong username or password.']")
    public  WebElement hataMesaji_WrongPassOrEmail;








}
