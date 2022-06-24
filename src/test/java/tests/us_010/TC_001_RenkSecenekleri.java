package tests.us_010;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import static utilities.TestBaseReport.extentReports;

public class
TC_001_RenkSecenekleri extends TestBaseReport {

    TradylinnPage tradylinnPage;

    @Test
    public void test01() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("test01","Renk secenekleri");

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

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        tradylinnPage.urunButonu.click();
        extentTest.info("Ürün butonuna tiklandi");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        tradylinnPage.pantolonButonu.click();
        extentTest.info("Pantolon butonuna tiklandi");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        tradylinnPage.attributesButonu.click();
        extentTest.info("Attributes butonuna tiklandi");

        tradylinnPage.colorKutucugu.click();
        extentTest.info("Color kutucuguna tiklandi");

        tradylinnPage.colorArama.click();
        extentTest.info("Color arama butonuna tiklandi");







    }
}
