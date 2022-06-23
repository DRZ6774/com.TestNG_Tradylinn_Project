package tests.us_001_SaticiOlarakKayitOlma;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.MainPage;
import pages.RegistrationPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseReport;

public class TC_002_RegistrationSayfasındaEmailPassWordVeConfirmPasswordOlması extends TestBaseReport {

   @Test
    public static void KayıtSayfasıOgeleriKonfirmasyonu(){

       MainPage mainPage=new MainPage();
       RegistrationPage registrationPage=new RegistrationPage();
       SoftAssert sf=new SoftAssert();


       extentTest=extentReports.
               createTest("Registration sayfasında uc özellik olmalı; email, password, confirm password");


       Driver.getDriver().get(ConfigReader.getProperty("mainPage"));

       extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

       mainPage.girisYap_UyeOlSekmesi.click();
       extentTest.info("Giriş yap/üye ol butonuna basınız.");

       mainPage.uyeOlSelmesi.click();
       extentTest.info("Üye ol sekmesine basiniz.");

       mainPage.signUpAsAVendorLinki.click();
       extentTest.info("signUp as a vendor sekmesine basınız.");

       sf.assertTrue(registrationPage.emailSekmesi.isDisplayed());
       sf.assertTrue(registrationPage.passwordSekmesi.isDisplayed());
       sf.assertTrue(registrationPage.confirmPasswordSekmesi.isDisplayed());
       sf.assertAll();
       extentTest.pass("e-mail, password ve confirm password sekmelerinin mevcudiyetini konfirme ediniz");
   }
}
