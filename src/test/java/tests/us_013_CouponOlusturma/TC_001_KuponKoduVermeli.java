package tests.us_013_CouponOlusturma;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;
import utulities.TestBaseReport;

import javax.swing.*;

public class TC_001_KuponKoduVermeli extends TestBaseReport {

    KuponPage kuponPage = new KuponPage();
    MainPage mainPage = new MainPage();
    RegistrationPage registrationPage = new RegistrationPage();
    HesabimPage hesabimPage = new HesabimPage();
    StoreManagerPage storeManagerPage = new StoreManagerPage();


    @Test
    public void test01() {


        extentTest= extentReports.createTest("kupon olusturulabilmeli");

        Driver.getDriver().get(ConfigReader.getProperty("mainPage"));
        extentTest.info("https://www.tradylinn.com sitesine gidildi");

        registrationPage.homePageGirisYapSekmesi.click();
        extentTest.info("Girisyap/Uye ol sekmesine tiklandi");

        registrationPage.kullaniciAdiTextBox.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.info("ValidUserName girildi");

        registrationPage.kullaniciSifresiTextBox.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.info("ValidPassowrd girildi");

        registrationPage.girisYapButton.click();
        extentTest.info("Giris yap buttonu tiklandi");

        ReusableMethods.waitFor(10);        //explicitly wait yapılsa daha güzel olur
        //ReusableMethods.waitForVisibility(mainPage.hesabimSekmesi,15);
        mainPage.hesabimSekmesi.click();
        extentTest.info("Hesabim sekmesine gecildi");

        hesabimPage.storeManagerSekmesi.click();
        extentTest.info("Store Manager sekmesine geçildi");

        storeManagerPage.kuponlarSekmesi.click();
        extentTest.info("Kuponlar sekmesi tiklandi");

        kuponPage.yeniEkleButton.click();
        extentTest.info("Yeni ekle buttonuna basildi");

        kuponPage.kuponTitle.sendKeys(ConfigReader.getProperty("kupon01"));
        extentTest.info("Kupon title olarak kupon01 yazildi");
        Actions actions = new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        //ReusableMethods.waitForClickablility(kuponPage.kuponSubmitButton,15);
        //ReusableMethods.waitForVisibility(kuponPage.kuponSubmitButton,15);


        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView()", kuponPage.kuponSubmitButton);


        ReusableMethods.waitFor(10);
        kuponPage.kuponSubmitButton.click();
        //actions.moveToElement(kuponPage.kuponSubmitButton).click().perform();
        //actions.click(kuponPage.emailRestrictionsTextBox).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
        //ReusableMethods.waitFor(10);
        //actions.click(kuponPage.emailRestrictionsTextBox).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
        //ReusableMethods.waitFor(10);
        extentTest.info("Kupon sayfasinda submit button basildi");



        ReusableMethods.waitForVisibility(kuponPage.CouponSuccesfullyPublishedText,15);
        Assert.assertTrue(kuponPage.CouponSuccesfullyPublishedText.isDisplayed());

        extentTest.pass("Basarili bir sekilde kopun kodu tanimlandi.");





        //ReusableMethods.waitFor(60);
    }
}
