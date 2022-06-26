package tests.us_005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US05_TC04 extends TestBaseReport {
    UrunPage urunPage = new UrunPage();
    SoftAssert softAssert = new SoftAssert();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void US05_TC04Testi() throws InterruptedException {
        extentTest=extentReports.createTest("US05_TC04","short description ve Description'a aciklama girilebilmeli ve etkin olmali");

        //1- https://tradylinn.com/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        extentTest.info("Sayfaya gidildi");

        //2-Giris Yap/Uye Ol butonuna basiniz
        urunPage.girisYap.click();
        extentTest.info("Giris Yap/Uye ol butonuna tiklandi");

        //3-Uygun email ve sifre giriniz.
        urunPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("tradyUserName"));
        extentTest.info("Gecerli email girildi");
        urunPage.password.sendKeys(ConfigReader.getProperty("tradyPassword")+ Keys.ENTER);
        extentTest.info("Gecerli password girildi");

        //4-hesabim butonuna tiklayin
        Thread.  sleep(10000);
        urunPage.hesabim.click();
        extentTest.info("Hesabim butonuna tiklandi");

        //5-Store Manager sekmesine tiklayin
        urunPage.storeManager.click();
        extentTest.info("Store manager sekmesine tiklandi");

        //6- urunler sekmesine tiklayin
        urunPage.urun.click();
        extentTest.info("Urunler sekmesine tiklandi");

        //7-Yeni ekle butonuna tiklayin
        urunPage.yeniEkle.click();
        extentTest.info("Yeni Ekle butonuna tiklandi");

        //8-short description girin
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.getDriver().switchTo().frame(urunPage.ShortIframe);
        urunPage.ShortDescription.sendKeys("Tabak");
        extentTest.info("Short description girildi");

        //9-short description etkin oldugunu test edin
        softAssert.assertTrue(urunPage.ShortDescription.isEnabled());
        Driver.getDriver().switchTo().parentFrame();
        extentTest.info("Short description etkin oldugu test edildi");

        //10-Description girin
        Driver.getDriver().switchTo().frame(urunPage.DescriptionIframe);
        urunPage.Description.sendKeys("Porselen");
        extentTest.info("Description girildi");

        //11-Description etkin oldugunu test edin
        softAssert.assertTrue(urunPage.Description.isEnabled());
        Driver.getDriver().switchTo().parentFrame();
        extentTest.info("Description etkin oldugu test edildi");
        extentTest.pass("short description ve Description'a aciklama girilebiliyor ve etkin durumda");

    }
}
