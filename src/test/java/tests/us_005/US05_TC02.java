package tests.us_005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US05_TC02 extends TestBaseRapor {
    UrunPage urunPage =new UrunPage();
    SoftAssert softAssert=new SoftAssert();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void US05_TC02Testi() throws InterruptedException {
        extentTest=extentReports.createTest("US05_TC02","Virtual ve Downloadable secenekleri secilebilir olmali");

        //1- https://tradylinn.com/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        extentTest.info("Sayfaya gidildi");

        //2-Giris Yap/Uye Ol butonuna basiniz
        urunPage.girisYap.click();
        extentTest.info("Giris Yap/Uye ol butonuna tiklandi");

        //3-Uygun email ve sifre giriniz.
        urunPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("tradyUserName"));
        extentTest.info("Gecerli email girildi");
        urunPage.password.sendKeys(ConfigReader.getProperty("tradyPassword")+Keys.ENTER);
        extentTest.info("Gecerli password girildi");

        //4-hesabim butonuna tiklayin
        Thread.sleep(10000);
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

        //8-Virtual ve Downloadable seceneklerine sirayla tiklayip sonrasinda secilebilir
        //oldugunu test edin
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        urunPage.virtualButton.click();
        extentTest.info("VirtualButton tiklandi");
        softAssert.assertTrue(urunPage.virtualButton.isSelected());
        extentTest.info("VirtualButton Secilebilir oldugu test edildi");

        urunPage.downloadableButton.click();
        softAssert.assertTrue(urunPage.downloadableButton.isSelected());
        extentTest.info("DownloadableButtonButton Secilebilir oldugu test edildi");
        extentTest.pass("Virtualbutton ve Downloadablebutton secilebilir durumda");

    }
}
