package tests.us_001_SaticiOlarakKayitOlma;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseReport;

public class TC_007_Guclu_Bir_Password_olusturulmali extends TestBaseReport {

    @Test
    public static void gucluBirPasswordOlusturulmali() throws InterruptedException {
        MainPage mainPage = new MainPage();
        RegistrationPage registrationPage = new RegistrationPage();
        Actions action=new Actions(Driver.getDriver());



        extentTest=extentReports.
                createTest("Güçlü bir password olusturulmali: kucuk harf, büyük harf, rakam ve special karakter kullanılmalı");


        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));



        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        mainPage.uyeOlSelmesi.click();
        extentTest.info("Üye ol sekmesine basiniz.");

        mainPage.signUpAsAVendorLinki.click();
        extentTest.info("signUp as a vendor sekmesine basınız.");

        action.sendKeys(Keys.PAGE_DOWN).perform();

        registrationPage.emailSekmesi.sendKeys(ConfigReader.getProperty("mail3"));
        extentTest.info("Mail sekmesine yeni bir mail adresi giriniz.");

        registrationPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("zayifSifre"));
        registrationPage.confirmPasswordSekmesi.sendKeys(ConfigReader.getProperty("zayifSifre"));
        extentTest.info(" password ve confirm password sekmelerine aynı şifreyi yazınız");


        Thread.sleep(8000);

        registrationPage.registerButonu.click();
        extentTest.info("Register butonuna basınız.");

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().
                equals(ConfigReader.getProperty("registrationPage")));

        extentTest.pass("Kayıt tamamlanmadıgini konfirme ediniz.");



    }
}