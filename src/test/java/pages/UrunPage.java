package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class UrunPage {
    public UrunPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
    @FindBy (xpath = "//a[@class='login inline-type']")
    public WebElement girisYap;

    @FindBy (xpath ="//input[@id='username']" )
    public WebElement kullaniciAdi;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy (xpath = "(//*[text()='Hesabım'])[1]")
    public WebElement hesabim;

    @FindBy (xpath = "//a[@href='https://tradylinn.com/store-manager/']")
    public WebElement storeManager;

    @FindBy (xpath = "(//span[@class='text'])[4]")
    public WebElement urun;

    @FindBy (xpath = "//*[text()='Yeni ekle']")
    public WebElement yeniEkle;

    @FindBy (xpath = "//input[@id='is_virtual']")
    public WebElement virtualButton;

    @FindBy (xpath = "//input[@id='is_downloadable']")
    public WebElement downloadableButton;

    @FindBy (xpath = "//input[@id='pro_title']")
    public WebElement productTitleButton;

    @FindBy (xpath = "//input[@id='regular_price']")
    public  WebElement priceButton;

    @FindBy (xpath = "//input[@id='sale_price']")
    public WebElement salePriceButton;

    @FindBy (xpath = "//img[@id='featured_img_display']")
    public WebElement featuredImgButton;

    @FindBy (xpath = "//img[@id='gallery_img_gimage_0_display']")
    public WebElement galleryImgButton;

    @FindBy (xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement fotoSecButton;

    @FindBy (xpath = "(//div[@class='thumbnail'])[2]")
    public WebElement galleryImgFotosu;

    @FindBy (xpath = "(//*[text()='Add to Gallery'])[3]")
    public WebElement addToGalleryButton;

    @FindBy (xpath = "//span[@class='wcfmfa fa-eye text_tip']")
    public WebElement viewsButton;

    @FindBy (xpath = "(//input[@type='checkbox'])[3]")
    public WebElement besinTakviyeleriButton;

    @FindBy (xpath = "(//input[@name='product_cats[]'])[7]")
    public WebElement cokSatanlarButton;

    @FindBy (xpath = "(//input[@name='product_cats[]'])[9]")
    public WebElement ElektrikElektronikButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[11]")
    public WebElement evYasamButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[17]")
    public WebElement indirimliUrunlerButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[19]")
    public WebElement kitapMuzikFilmButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[21]")
    public WebElement kozmetikKisiselButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[22]")
    public WebElement modaGiyimButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[33]")
    public WebElement takiAksesuarButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[30]")
    public WebElement oyuncakButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_cat '])[36]")
    public WebElement yeniUrunlerButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_brand '])[5]")
    public WebElement elegantAutoGroupButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_brand '])[8]")
    public WebElement greenGrassButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_brand '])[16]")
    public WebElement nodeJsButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_brand '])[17]")
    public WebElement nS8Button;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_brand '])[20]")
    public WebElement redButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_brand '])[26]")
    public WebElement skysuiteTechButton;

    @FindBy (xpath = "(//input[@class='wcfm-checkbox checklist_type_product_brand '])[28]")
    public WebElement sterlingButton;

    @FindBy (xpath = "//iframe[@id='excerpt_ifr']")
    public WebElement ShortIframe; //iframe var

    @FindBy (xpath = "//body[@data-id='excerpt']")
    public WebElement ShortDescription;

    @FindBy (xpath = "//iframe[@id='description_ifr']")
    public WebElement DescriptionIframe;//iframe var

    @FindBy (xpath = "//body[@data-id='description']")
    public WebElement Description;


    @FindBy (id = "wcfm_products_simple_submit_button")
    public WebElement submitButton;

    @FindBy (xpath = "//tbody")
    public WebElement productUrunListesi;

    @FindBy (xpath = "//th[@class='sorting_disabled']")
    public List<WebElement> statusStockBasliklari;

    @FindBy (xpath = "//th[@class='sorting']")
    public List<WebElement> priceDateBasliklari;


    @FindBy (xpath = "//*[text()='Dosya seçin']")
    public WebElement dosyaSeçButton;

    @FindBy (xpath = " (//*[text()='1,000.00'])[2]")
    public WebElement priceMiktari;
    //input[@value='1000']


    @FindBy (xpath = "(//*[text()='950.00'])[1]")
    public WebElement salePriceMiktari;
    //input[@value='950']

    @FindBy (xpath = "(//img[@alt='images (1)'])[2]")
    public WebElement galleryImgGorunuyorMu;

    @FindBy (xpath = "//img[@class='wp-post-image']")
    public WebElement featuredImgGorunuyorMu;










}
