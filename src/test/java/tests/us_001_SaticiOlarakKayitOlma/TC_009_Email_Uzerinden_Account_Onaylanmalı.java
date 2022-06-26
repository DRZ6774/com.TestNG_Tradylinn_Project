package tests.us_001_SaticiOlarakKayitOlma;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GmailPage;
import pages.MainPage;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.util.Set;

public class TC_009_Email_Uzerinden_Account_Onaylanmalı extends TestBaseReport {

     @Test
    public static void TC001() throws InterruptedException {

         MainPage mainPage=new MainPage();
         RegistrationPage registrationPage=new RegistrationPage();
         GmailPage gmailPage=new GmailPage();
         Actions action=new Actions(Driver.getDriver());


         extentTest=extentReports.
                 createTest("Email üzerinden hesap onaylanabilmeli.");


        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));

         extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

         mainPage.girisYap_UyeOlSekmesi.click();
         extentTest.info("Giriş yap/üye ol butonuna basınız.");

         mainPage.uyeOlSelmesi.click();
         extentTest.info("Üye ol sekmesine basiniz.");

         mainPage.signUpAsAVendorLinki.click();
         extentTest.info("signUp as a vendor sekmesine basınız.");

         registrationPage.emailSekmesi.sendKeys(ConfigReader.getProperty("US01TC09Mail"));
         registrationPage.passwordSekmesi.sendKeys(ConfigReader.getProperty("US01TC09Sifre"));
         extentTest.info("Uygun email ve sifre giriniz.");

         registrationPage.confirmPasswordSekmesi.sendKeys(ConfigReader.getProperty("US01TC09Sifre"));
         extentTest.info("Sifre konfirmasyonu için şifreyi confirm password sekmesine yeniden giriniz.");

         action.sendKeys(Keys.PAGE_DOWN).perform();

         Thread.sleep(7000);

         registrationPage.registerButonu.click();
         extentTest.info("Register butonuna basınız.");

         Thread.sleep(20000);
         Assert.assertTrue(registrationPage.aktivasyonMailiMesajı.isDisplayed());

         extentTest.info("aktivasyon maili mesajının görülüğ görülmediğini konfirme ediniz.");

         Thread.sleep(10000);


         Driver.getDriver().get(ConfigReader.getProperty("gmail"));

         extentTest.info("Gmail sitesine gidiniz");

         gmailPage.emailSekmesi.sendKeys(ConfigReader.getProperty("US01TC09Mail"));

         gmailPage.emailSekmesi.sendKeys(Keys.ENTER);

         extentTest.info("Email sekmesine doğru emaili giriniz");
         Thread.sleep(8000);


         gmailPage.sifre.sendKeys(ConfigReader.getProperty("US01TC09Sifre"));

         gmailPage.sifre.sendKeys(Keys.ENTER);

         extentTest.info("Dogru şifreyi giriniz");

         gmailPage.aktivasyonMaili.click();

          extentTest.info("Aktivasyon mailine tıklayınız");

          Thread.sleep(5000);

          action.sendKeys(Keys.PAGE_DOWN).perform();

          gmailPage.aktivasyonLinki.click();

          Thread.sleep(10000);


          extentTest.info("Aktivasyon linkine tıklayıp siteye giriş yapınız.");

         Set<String> handles= Driver.getDriver().getWindowHandles();

        String actualWindows=Driver.getDriver().getWindowHandle();

        String yeniSayfaHandle="";

         for (String each: handles
              ) {
             if(!each.equals(actualWindows))
             yeniSayfaHandle=each;}

         Driver.getDriver().switchTo().window(yeniSayfaHandle);

         Driver.getDriver().getCurrentUrl();

         Assert.assertTrue(Driver.getDriver().getCurrentUrl()
                 .equals(ConfigReader.getProperty("onaySonrasiPencere")));

         extentTest.pass("Tradylinn'de hesap sayfasına yönlendirildiğinizi doğrulayın. ");



    }
}
