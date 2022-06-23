package tests.us_002_VendorOlarakSignInYapılabilmeli;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseReport;

public class TC_006_Vendor_Giris_KullaniciAdi_Yanlis_Sifre_Dogru extends TestBaseReport {

    @Test
    public static void kullaniciGiris() throws InterruptedException {
        extentTest = extentReports.
                createTest("Vendor olarak giriş(kullanici adi yanlis,sifre dogru)");

        MainPage mainPage = new MainPage();
        RegistrationPage registrationPage=new RegistrationPage();


        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));

        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        mainPage.girisEmail.sendKeys("ConfigReader.getProperty");
        extentTest.info("Email sekmesine dogru e-mail giriniz");


        mainPage.girisSifre.sendKeys(ConfigReader.getProperty("kullaniciSifre"));
        extentTest.info("Hatalı şifre giriniz.");

        mainPage.girisButonu.click();
        extentTest.info("Giris yap butonuna basınız.");

        Thread.sleep(7000);

        Assert.assertTrue(registrationPage.hataMesaji_WrongPassOrEmail.isDisplayed());

        extentTest.pass("Hatalı şifre ve doğru kullanıcı adı ile giriş yapılamadigini doğrulayınız.");
    }


}
