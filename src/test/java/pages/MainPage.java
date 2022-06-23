package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.commons.compress.archivers.zip.X000A_NTFS;
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

    @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[1]")
    public  WebElement girisEmail;

    @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[2]")
    public  WebElement girisSifre;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public  WebElement girisButonu;

    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    public  WebElement alisverisSepeti;


    @FindBy(xpath = "(//a[@href='https://tradylinn.com/my-account-2/'])")
    public WebElement hesabim;

    @FindBy(xpath = "(//a[@href='https://tradylinn.com/my-account-2/'])[2]")
    public WebElement hesabimPano;








    //MEHMET MAGDEN
    @FindBy (xpath = "//a[text()='Hesabım']")
    public WebElement hesabimSekmesi;
}
