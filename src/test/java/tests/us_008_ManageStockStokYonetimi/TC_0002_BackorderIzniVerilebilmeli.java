package tests.us_008_ManageStockStokYonetimi;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import pages.StoreManagerPage;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_0002_BackorderIzniVerilebilmeli extends TestBaseReport {
    @Test
    public void testTC_0002() throws InterruptedException {

        MainPage mainPage = new MainPage();
        RegistrationPage registrationPage = new RegistrationPage();
        UrunPage urunPage = new UrunPage();
        StoreManagerPage storeManagerPage = new StoreManagerPage();

        extentTest = extentReports.
                createTest("Urun miktarı stock belirlenmeli");
        //1-https://tradylinn.com/ sitesine gidiniz.
        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));
        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        //2-Giriş yap/üye ol butonuna basınız.
        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        //3-Üye ol sekmesine basiniz.
        mainPage.uyeOlSelmesi.click();
        extentTest.info("Üye ol sekmesine basiniz.");

        //4-signUp as a vendor sekmesine basınız.
        mainPage.signUpAsAVendorLinki.click();
        extentTest.info("signUp as a vendor sekmesine basınız.");

        //5-Uygun email ve sifre giriniz.
        registrationPage.emailSekmesi.sendKeys(ConfigReader.getProperty("mail1"));
        registrationPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("sifreMail1"));
        extentTest.info("Uygun email ve sifre giriniz.");

        //6-Sifre konfirmasyonu için şifreyi confirm password sekmesine yeniden giriniz.
        registrationPage.confirmPasswordSekmesi.sendKeys(ConfigReader.getProperty("sifreMail1"));
        extentTest.info("Sifre konfirmasyonu için şifreyi confirm password sekmesine yeniden giriniz.");
        Thread.sleep(7000);

        //7-Register butonuna basınız.
        registrationPage.registerButonu.click();
        extentTest.info("Register butonuna basınız.");

        //8-hesabim butonuna tiklayin
        Thread.sleep(3000);
        urunPage.hesabim.click();
        extentTest.info("Hesabim butonuna tiklandi");

        //9-Store Manager sekmesine tiklayin
        urunPage.storeManager.click();
        extentTest.info("Store manager sekmesine tiklandi");

        //10- urunler sekmesine tiklayin
        urunPage.urun.click();
        extentTest.info("Urunler sekmesine tiklandi");

        //11-stockManagerSekmesi tiklayiniz.
        storeManagerPage.stockManagerSekmesi.click();
        extentTest.info("stockManagerSekmesi tiklandi");

        //12-backordersAlanina tıklayınız.
        storeManagerPage.backordersAlani.click();
        extentTest.info("backordersAlanina tıklandi");
    }
}