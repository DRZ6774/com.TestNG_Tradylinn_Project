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

public class TC_003_Email_Bos_Birakilamaz extends TestBaseReport {

     @Test
    public static void emailBosBirakilamaz() throws InterruptedException {
        MainPage mainPage = new MainPage();
        RegistrationPage registrationPage = new RegistrationPage();
       Actions action=new Actions(Driver.getDriver());



         extentTest=extentReports.
                 createTest("Email Boş birakilamaz");


         Driver.getDriver().get(ConfigReader.getProperty("mainPage"));

         String sayfaUrl=Driver.getDriver().getCurrentUrl();

         extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

         mainPage.girisYap_UyeOlSekmesi.click();
         extentTest.info("Giriş yap/üye ol butonuna basınız.");

         mainPage.uyeOlSelmesi.click();
         extentTest.info("Üye ol sekmesine basiniz.");

         mainPage.signUpAsAVendorLinki.click();
         extentTest.info("signUp as a vendor sekmesine basınız.");

         action.sendKeys(Keys.PAGE_DOWN).perform();

         registrationPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("sifreMail1"));
         registrationPage.confirmPasswordSekmesi.sendKeys(ConfigReader.getProperty("sifreMail1"));
         extentTest.info(" password ve confirm password sekmelerine aynı şifreyi yazınız");


         Thread.sleep(8000);

         registrationPage.registerButonu.click();
         extentTest.info("Register butonuna basınız.");

         Assert.assertTrue(Driver.getDriver().getCurrentUrl().
                 equals(ConfigReader.getProperty("registrationPage")));

         extentTest.pass("Kayıt tamamlanmadıgini konfirme ediniz.");



    }
    }
