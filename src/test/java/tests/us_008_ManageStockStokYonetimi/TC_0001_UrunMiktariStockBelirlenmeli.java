package tests.us_008_ManageStockStokYonetimi;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.StoreManagerPage;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_0001_UrunMiktariStockBelirlenmeli extends TestBaseReport {

    @Test
    public void testTC_0001() {

        MainPage mainPage;
        UrunPage urunPage ;
        StoreManagerPage storeManagerPage;
        JavascriptExecutor jse;

        extentTest = extentReports.createTest("Urun miktarı stock belirlenmeli");

        mainPage=new MainPage();
        urunPage =new UrunPage();
        storeManagerPage=new StoreManagerPage();
        jse = (JavascriptExecutor)Driver.getDriver();

        //1-https://tradylinn.com/ sitesine gidiniz.
        ReusableMethods.waitFor(5);
        Driver.getDriver().navigate().to(ConfigReader.getProperty("mainPage"));
        extentTest.info("https://www.tradylinn.com sitesine gidildi");

        //2-Giriş yap/üye ol butonuna basınız.
        ReusableMethods.waitFor(5);
        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Girisyap/Uye ol sekmesine tiklandi");

        //3-Gecerli username giriniz.
        ReusableMethods.waitFor(5);
        mainPage.girisEmail.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.info("Gecerli username girildi");

        //4-Gecerli password giriniz.
        ReusableMethods.waitFor(5);
        mainPage.girisSifre.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.info("Gecerli password girildi");

        //5-Giris butonuna basınız.
        ReusableMethods.waitFor(10);
        mainPage.girisButonu.click();
        extentTest.info("Giris butonuna tıklandı");

        //6-hesabim butonuna tiklayin
        ReusableMethods.waitFor(10);
        jse.executeScript("arguments[0].scrollIntoView()",  urunPage.hesabim);
        jse.executeScript("arguments[0].click();",urunPage.hesabim );
        extentTest.info("Hesabim butonuna tiklandi");

        //7-Store Manager sekmesine tiklayin
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView()",  urunPage.storeManager);
        jse.executeScript("arguments[0].click();",urunPage.storeManager );
        extentTest.info("Store manager sekmesine tiklandi");

        //8-Urunler sekmesine tiklayin
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView()",  urunPage.urun);
        jse.executeScript("arguments[0].click();",urunPage.urun );
        extentTest.info("Urunler sekmesine tiklandi");

        //9- t-shirt ürününe tıklayınız
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView()",  storeManagerPage.tshirt);
        jse.executeScript("arguments[0].click();",storeManagerPage.tshirt );
        //storeManagerPage.tshirt.click();
        extentTest.info("T-shirt butonuna tıklandı");

        //10-managestock sekmesi tiklayiniz.
        ReusableMethods.waitFor(3);
        jse.executeScript("arguments[0].scrollIntoView()",  storeManagerPage.manageStock);
        jse.executeScript("arguments[0].click();",storeManagerPage.manageStock );
        jse.executeScript("arguments[0].scrollIntoView()",  storeManagerPage.manageStock);
        jse.executeScript("arguments[0].click();",storeManagerPage.manageStock );
        extentTest.info("manegeStock sekmesi tiklandi");

        //11-stockQty alanına urun-stok miktari giriniz.
        ReusableMethods.waitFor(5);
        storeManagerPage.stockQty.clear();
        storeManagerPage.stockQty.sendKeys("10");
        extentTest.info("stockQty alanına urun miktari-stok girildi");

        //12-submit butonuna tıklanarak kaydediniz.
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView()",  storeManagerPage.submitButonu);
        jse.executeScript("arguments[0].click();",storeManagerPage.submitButonu );
        extentTest.info("submit butonuna tıklanarak kaydedildi");

        //13-stockQty alanına urun-stok miktarini kontrol ediniz.
        Assert.assertTrue(storeManagerPage.stockQty.isDisplayed());
        extentTest.info("stockQty alanına urun-stok miktarini kontrol edildi");
    }
}
