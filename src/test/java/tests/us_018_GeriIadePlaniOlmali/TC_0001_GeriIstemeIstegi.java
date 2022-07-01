package tests.us_018_GeriIadePlaniOlmali;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;


public class TC_0001_GeriIstemeIstegi extends TestBaseReport {
    @Test
    public void testTC_0001()  {

        MainPage mainPage;
        UrunPage urunPage;
        JavascriptExecutor jse;
        GeriOdemePage geriOdemePage;


        extentTest = extentReports.createTest("RequestID belli olmalı");

        mainPage=new MainPage();
        urunPage =new UrunPage();
        jse = (JavascriptExecutor)Driver.getDriver();
        geriOdemePage=new GeriOdemePage();


        //1-https://tradylinn.com/ sitesine gidiniz.
        ReusableMethods.waitFor(5);
        Driver.getDriver().navigate().to(ConfigReader.getProperty("mainPage"));
        extentTest.info("https://www.tradylinn.com sitesine gidildi");

        //2-Giriş yap/üye ol butonuna basınız.
        ReusableMethods.waitFor(5);
        mainPage.girisYap_UyeOlSekmesi.click();
        extentTest.info("Girisyap/Uye ol sekmesine tiklandi");

        //3-Gecerli username giriniz.
        ReusableMethods.waitFor(5);
        mainPage.girisEmail.sendKeys(ConfigReader.getProperty("validUserName"));
        extentTest.info("Gecerli username girildi");

        //4-Gecerli password giriniz.
        ReusableMethods.waitFor(5);
        mainPage.girisSifre.sendKeys(ConfigReader.getProperty("validPassword"));
        extentTest.info("Gecerli password girildi");

        //5-Giris butonuna basınız.
        ReusableMethods.waitFor(5);
        mainPage.girisButonu.click();
        extentTest.info("Giris butonuna tıklandı");

        //6-hesabim butonuna tiklayin
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView()",  urunPage.hesabim);
        jse.executeScript("arguments[0].click();",urunPage.hesabim );
        extentTest.info("Hesabim butonuna tiklandi");

        //7-Store Manager sekmesine tiklayin
        ReusableMethods.waitFor(5);
        urunPage.storeManager.click();
        extentTest.info("Store manager sekmesine tiklandi");

        //8-Geri ödeme butonuna tıklayınız.
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView()",  geriOdemePage.geriOdmeSekmesi);
        jse.executeScript("arguments[0].click();",geriOdemePage.geriOdmeSekmesi );
        extentTest.info("Geri ödeme butonuna tıklandi");

        //9requested arama motoruna tıklayınız
        ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView()",  geriOdemePage.requestedAramaButonu);
        jse.executeScript("arguments[0].click();",geriOdemePage.requestedAramaButonu );
        extentTest.info("requested arama motoruna tıklandı");

        //10-RequestID degeri kontrol ediniz.
        ReusableMethods.waitFor(5);
        String expectedRequestID="# 40";
        String actualRequestID=geriOdemePage.requestIDDegeri.getText();
        Assert.assertEquals(expectedRequestID,actualRequestID);
        extentTest.info("RequestID degeri görüldü");

    }
}