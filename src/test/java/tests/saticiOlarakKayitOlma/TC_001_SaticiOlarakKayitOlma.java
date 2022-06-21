package tests.saticiOlarakKayitOlma;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseReport;

import java.io.ObjectInputFilter;

public class TC_001_SaticiOlarakKayitOlma extends TestBaseReport {


    @Test
    public static void TC_001() throws InterruptedException {

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

        Thread.sleep(7000);

        registrationPage.registerButonu.click();
        extentTest.info("Register butonuna basınız.");

        Thread.sleep(20000);
        Assert.assertTrue(registrationPage.aktivasyonMailiMesajı.isDisplayed());

        extentTest.pass("aktivasyon maili mesajının görülüğ görülmediğini konfirme ediniz.");




    }


}
