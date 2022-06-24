package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TradylinnPage {
    public TradylinnPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement anaSayfaGirisYapButonu;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement kullaniciAdiButonu;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement parolaButonu;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButonu;

    @FindBy(xpath = "(//a[@href='https://tradylinn.com/my-account-2/'])")
    public WebElement hesabimButonu;

    @FindBy(xpath = "//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement storeManagerButonu;

    @FindBy(xpath = "(//a[@class='wcfm_menu_item '])[3]")
    public WebElement urunButonu;

    @FindBy(xpath= "//span[@class='text'])[16]")
    public WebElement incelemelerButonu;

    @FindBy(xpath = "(//a[@class='wcfm_product_title'])[2]")
    public WebElement pantolonButonu;

    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributesButonu;

    @FindBy(xpath = "//input[@name='attributes[1][is_active]']")
    public WebElement colorKutucugu;

    @FindBy(xpath = "//input[@name='attributes[2][is_active]']")
    public WebElement sizeKutucugu;

    @FindBy(xpath = "(//*[@aria-live='polite'])[3]")
    public WebElement colorArama;

    @FindBy(xpath = "(//*[@class='select2-selection__rendered'])[4]")
    public WebElement sizeArama;

    @FindBy(xpath = "(//span[@class='text'])[19]")
    public WebElement productReviewsButonu;

    @FindBy(xpath = "(//div[@class='wcfmmp-author-meta'])[3]")
    public WebElement kullaniciBilgisi;

    @FindBy(xpath = "(//div[@class='wcfmmp-comments-content'])[3]")
    public WebElement kullaniciYorumu;

    @FindBy(xpath = "(//span[@style='width:100%'])[2]")
    public WebElement kullaniciPuani;

    @FindBy(xpath = "(//td)[27]")
    public WebElement kullaniciYorumTarihi;

    











    }
