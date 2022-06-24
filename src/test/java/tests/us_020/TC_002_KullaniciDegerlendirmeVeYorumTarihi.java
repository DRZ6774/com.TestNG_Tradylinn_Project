package tests.us_020;

import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import static utilities.TestBaseReport.extentReports;

public class TC_002_KullaniciDegerlendirmeVeYorumTarihi extends TestBaseReport {

    TradylinnPage tradylinnPage;

        @Test
        public void test02() throws InterruptedException {

            extentTest = extentReports.createTest("test02","Kullanici degerlendirme ve yorum tarihi");

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

            tradylinnPage.incelemelerButonu.click();
            extentTest.info("İncelemeler butonuna tiklandi");

            tradylinnPage.productReviewsButonu.click();
            extentTest.info("Product reviews butonuna tiklandi");

            tradylinnPage.kullaniciPuani.isDisplayed();
            extentTest.info("Kullanici degerlendirmesinin görülebilir oldugu test edildi");

            tradylinnPage.kullaniciYorumTarihi.isDisplayed();
            extentTest.info("Kullanici yorum tarihinin görülebilir oldugu test edildi");







        }
}
