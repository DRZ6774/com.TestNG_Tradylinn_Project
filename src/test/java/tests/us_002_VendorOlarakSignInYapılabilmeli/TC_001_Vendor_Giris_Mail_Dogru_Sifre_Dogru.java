package tests.us_002_VendorOlarakSignInYapılabilmeli;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_001_Vendor_Giris_Mail_Dogru_Sifre_Dogru extends TestBaseReport {

    @Test
    public static void emailGiris() {
        extentTest = extentReports.
                createTest("Vendor olarak giriş(Email dogru,sifre dogru)");

        MainPage mainPage = new MainPage();


        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));

        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        mainPage.girisEmail.sendKeys(ConfigReader.getProperty("US01TC09Mail"));
        extentTest.info("Email sekmesine dogru e-mail giriniz");


        mainPage.girisSifre.sendKeys(ConfigReader.getProperty("US01TC09Sifre"));
        extentTest.info("Parola sekmesine koydolurken girilen sifreyi giriniz.");

        mainPage.girisButonu.click();
        extentTest.info("Giris yap butonuna basınız.");

        mainPage.hesabim.click();
        Assert.assertTrue(mainPage.hesabimPano.isDisplayed());

        extentTest.pass("Daha önce kaydolmuş hesabın aynı şifre ile giriş yapabildiğini doğrulayınız.");
    }


}
