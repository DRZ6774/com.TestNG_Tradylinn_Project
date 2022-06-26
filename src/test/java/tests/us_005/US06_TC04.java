package tests.us_005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class US06_TC04 extends TestBaseReport {
    UrunPage urunPage = new UrunPage();
    SoftAssert softAssert = new SoftAssert();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void US06_TC04Testi() throws InterruptedException {
        extentTest=extentReports.createTest("US06_TC04","Categories-Elektrik & Elektronik butonu secilebilmeli");

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

        //7-Categories-Ev & yasam secin
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        urunPage.evYasamButton.click();
        extentTest.info("Ev & yasam butonuna tiklandi");

        //8-Categories-Ev & yasam secilebilir oldugunu test edin
        softAssert.assertTrue(urunPage.evYasamButton.isSelected());
        extentTest.info("Categories-Ev & yasam butonunun secilebilir oldugu test edildi");
        extentTest.pass("Categories-Ev & yasam butonu secilebiliyor");
    }
}
