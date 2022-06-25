package tests.us_010;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class TC_002_BedenSecenekleri extends TestBaseReport{

    TradylinnPage tradylinnPage;

    @Test
    public void test02() throws InterruptedException {

        Actions actions = new Actions(Driver.getDriver());

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

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        tradylinnPage.urunButonu.click();
        extentTest.info("Ürün butonuna tiklandi");

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        tradylinnPage.pantolonButonu.click();
        extentTest.info("Pantolon butonuna tiklandi");

        /*actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        tradylinnPage.attributesButonu.click(); */

        WebElement willGoAndDoWork = tradylinnPage.attributesButonu;      //just changing this part do the magic
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView()", willGoAndDoWork);
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForClickablility(willGoAndDoWork,15);
        willGoAndDoWork.click();
        extentTest.info("Attributes butonuna tiklandi");

        tradylinnPage.sizeKutucugu.click();
        extentTest.info("Size kutucuguna tiklandi");

        tradylinnPage.sizeArama.click();
        extentTest.info("Size arama butonuna tiklandi");

        Assert.assertTrue(tradylinnPage.sizeArama.isDisplayed());
        extentTest.info("Size cesitlerinin görünürlügü test edildi");


    }
}