package tests.us_010;

import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import static utilities.TestBaseReport.extentReports;

public class TC_002_BedenSecenekleri extends TestBaseReport{

    TradylinnPage tradylinnPage;

    @Test
    public void test02() throws InterruptedException {

        extentTest = extentReports.createTest("test02","Beden secenekleri");

        tradylinnPage = new TradylinnPage();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        extentTest.info("Tradylinn anasayfaya gidildi");

        tradylinnPage.anaSayfaGirisYapButonu.click();
        extentTest.info("Anasayfadaki giris yap butonuna tiklandi");

        tradylinnPage.kullaniciAdiButonu.sendKeys(ConfigReader.getProperty("tradylinnValidKullaniciAdi"));
        extentTest.info("Gecerli kullanici adi yazildi");

        tradylinnPage.parolaButonu.sendKeys(ConfigReader.getProperty("tradylinnValidParola"));
        extentTest.info("Gecerli parola yazildi");

        tradylinnPage.girisYapButonu.click();
        extentTest.info("Giris yap butonuna tiklandi");

        Thread.sleep(10000);

        tradylinnPage.hesabimButonu.click();
        extentTest.info("Hesabim butonuna tiklandi");

        tradylinnPage.storeManagerButonu.click();
        extentTest.info("Store manager butonuna tiklandi");

        tradylinnPage.urunButonu.click();
        extentTest.info("Ürün butonuna tiklandi");

        tradylinnPage.pantolonButonu.click();
        extentTest.info("Pantolon butonuna tiklandi");

        tradylinnPage.attributesButonu.click();
        extentTest.info("Attributes butonuna tiklandi");

        tradylinnPage.sizeKutucugu.click();
        extentTest.info("Size kutucuguna tiklandi");

        tradylinnPage.sizeArama.click();
        extentTest.info("Size arama butonuna tiklandi");






    }
}