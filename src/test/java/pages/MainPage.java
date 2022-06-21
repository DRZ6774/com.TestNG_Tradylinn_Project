package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class MainPage {

    public MainPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = ("//span[text()='Giriş Yap']"))
    public WebElement girisYap_UyeOlSekmesi;

    @FindBy(xpath = ("//a[@href='signup']"))
    public WebElement uyeOlSelmesi;

    @FindBy(xpath = "(//a[@href='https://tradylinn.com/vendor-register/'])[1]")
    public  WebElement signUpAsAVendorLinki;
}
