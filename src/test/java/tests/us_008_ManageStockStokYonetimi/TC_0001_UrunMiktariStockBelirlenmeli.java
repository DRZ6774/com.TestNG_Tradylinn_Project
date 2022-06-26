package tests.us_008_ManageStockStokYonetimi;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_0001_UrunMiktariStockBelirlenmeli extends TestBaseReport {

    @Test
    public void testTC_0001()throws InterruptedException {
        MainPage mainPage=new MainPage();
        RegistrationPage registrationPage=new RegistrationPage();

        extentTest=extentReports.
                createTest("Vendor olarak kayıt icin ‘Become a vendor’ butonu ile navigate ediniz");

        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));

        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        mainPage.uyeOlSelmesi.click();
        extentTest.info("Üye ol sekmesine basiniz.");

        mainPage.signUpAsAVendorLinki.click();
        extentTest.info("signUp as a vendor sekmesine basınız.");

        registrationPage.emailSekmesi.sendKeys(ConfigReader.getProperty("mail1"));
        registrationPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("sifreMail1"));
        extentTest.info("Uygun email ve sifre giriniz.");

        registrationPage.confirmPasswordSekmesi.sendKeys(ConfigReader.getProperty("sifreMail1"));
        extentTest.info("Sifre konfirmasyonu için şifreyi confirm password sekmesine yeniden giriniz.");

        Thread.sleep(10000);

        registrationPage.registerButonu.click();
        extentTest.info("Register butonuna basınız.");

        Thread.sleep(30000);
        Assert.assertTrue(registrationPage.aktivasyonMailiMesajı.isDisplayed());

        extentTest.pass("aktivasyon maili mesajının görülüğ görülmediğini konfirme ediniz.");
    }
}
