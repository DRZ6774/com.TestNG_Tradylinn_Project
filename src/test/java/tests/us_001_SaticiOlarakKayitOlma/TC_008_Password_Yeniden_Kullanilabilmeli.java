package tests.us_001_SaticiOlarakKayitOlma;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class TC_008_Password_Yeniden_Kullanilabilmeli extends TestBaseReport {


    @Test
    public static void TC_001() throws InterruptedException {

        MainPage mainPage = new MainPage();

        extentTest=extentReports.
                createTest("Güçlü bir password olusturulmali: kucuk harf, büyük harf, rakam ve special karakter kullanılmalı");


        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));



        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        mainPage.girisEmail.sendKeys(ConfigReader.getProperty("mail2"));
        extentTest.info("Email sekmesine dogru e-mail giriniz");


        mainPage.girisSifre.sendKeys(ConfigReader.getProperty("sifreMail1"));
        extentTest.info("Parola sekmesine koydolurken girilen sifreyi giriniz.");

        mainPage.girisButonu.click();
        extentTest.info("Giris yap butonuna basınız.");

        mainPage.hesabim.click();

        Assert.assertTrue(mainPage.hesabimPano.isDisplayed());

        extentTest.pass("Daha önce kaydolmuş hesabın aynı şifre ile giriş yapabildiğini doğrulayınız.");




    }
}
