package tests.us_005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class US06_TC02 extends TestBaseReport {
    UrunPage urunPage = new UrunPage();
    SoftAssert softAssert = new SoftAssert();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void US06_TC02Testi() {
        extentTest=extentReports.createTest("US06_TC02","Categories-cok satanlar butonu secilebilmeli");

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
        ReusableMethods.waitFor(10);
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

        //7-Categories-cok satanlar secin
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        urunPage.cokSatanlarButton.click();
        extentTest.info("cok satanlar butonuna tiklandi");

        //8-Categories-cok satanlarin secilebilir oldugunu test edin
        softAssert.assertTrue(urunPage.cokSatanlarButton.isSelected());
        extentTest.info("cok satanlar butonunun secilebilir oldugu test edildi");
        extentTest.pass("cok satanlar butonu secilebiliyor");
    }
}