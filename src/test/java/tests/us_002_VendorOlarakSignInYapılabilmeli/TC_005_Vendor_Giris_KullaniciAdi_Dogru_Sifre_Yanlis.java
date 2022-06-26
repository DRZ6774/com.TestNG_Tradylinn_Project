package tests.us_002_VendorOlarakSignInYapılabilmeli;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_005_Vendor_Giris_KullaniciAdi_Dogru_Sifre_Yanlis extends TestBaseReport {

    @Test
    public static void kullaniciGiris() throws InterruptedException {
        extentTest = extentReports.
                createTest("Vendor olarak giriş(kullanici adi dogru,sifre yanlis)");

        MainPage mainPage = new MainPage();
        RegistrationPage registrationPage=new RegistrationPage();


        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));

        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        mainPage.girisEmail.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        extentTest.info("Email sekmesine dogru e-mail giriniz");


        mainPage.girisSifre.sendKeys("random");
        extentTest.info("Hatalı şifre giriniz.");

        mainPage.girisButonu.click();
        extentTest.info("Giris yap butonuna basınız.");

        Thread.sleep(7000);

        Assert.assertTrue(registrationPage.hataMesaji_WrongPassOrEmail.isDisplayed());

        extentTest.pass("Daha önce kaydolmuş kullanıcı adına hatalı şifre ile giriş yapılamadigini doğrulayınız.");
    }


}
