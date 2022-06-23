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

public class TC_004_Hatali_Email_le_Kaydolunamaz  extends TestBaseReport {

    @Test
    public static void hataliEmailIleGirisYapamaz() throws InterruptedException {
        MainPage mainPage = new MainPage();
        RegistrationPage registrationPage = new RegistrationPage();
        Actions action=new Actions(Driver.getDriver());



        extentTest=extentReports.
                createTest("Hatali e-mail ile giriş yapılamaz.");


        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));



        extentTest.info("https://tradylinn.com/ sitesine gidiniz.");

        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Giriş yap/üye ol butonuna basınız.");

        mainPage.uyeOlSelmesi.click();
        extentTest.info("Üye ol sekmesine basiniz.");

        mainPage.signUpAsAVendorLinki.click();
        extentTest.info("signUp as a vendor sekmesine basınız.");

        action.sendKeys(Keys.PAGE_DOWN).perform();

        registrationPage.emailSekmesi.sendKeys(ConfigReader.getProperty("hataliMail"));
        extentTest.info("Mail sekmesina hatalı bir email giriniz");

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