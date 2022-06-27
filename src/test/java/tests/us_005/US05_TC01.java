package tests.us_005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;


import java.util.ArrayList;
import java.util.List;

public class US05_TC01 extends TestBaseReport {
    UrunPage urunPage =new UrunPage();
    SoftAssert softAssert=new SoftAssert();


    @Test
    public void US05_TC01Testi() {
       extentTest=extentReports.createTest("US05_TC01","Urun listesi ve basliklar gorunuyor olmali");
        //1- https://tradylinn.com/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("tradyUrl"));
        extentTest.info("Sayfaya gidildi");

        //2-Giris Yap/Uye Ol butonuna basiniz
        urunPage.girisYap.click();
        extentTest.info("Giris Yap/Uye ol butonuna tiklandi");

        //3-Uygun email ve sifre giriniz.
        urunPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("tradyUserName"));
        extentTest.info("Gecerli email girildi");
        urunPage.password.sendKeys(ConfigReader.getProperty("tradyPassword")+ Keys.ENTER);
        extentTest.info("Gecerli password girildi");

        //4-hesabim butonuna tiklayin
        ReusableMethods.waitFor(3);
        urunPage.hesabim.click();
        extentTest.info("Hesabim butonuna tiklandi");

        //5-Store Manager sekmesine tiklayin
        urunPage.storeManager.click();
        extentTest.info("Store manager sekmesine tiklandi");

        //6- urunler sekmesine tiklayin
        urunPage.urun.click();
        extentTest.info("Urunler sekmesine tiklandi");

        //7-Productsta urun listesinin görununurlugunu test edin
        softAssert.assertTrue(urunPage.productUrunListesi.isDisplayed());
        extentTest.info("Productsta urun listesi gorununurlugu test edildi");

        //8-status, stock, price, date basliklarinin gorununurlugunu test edin
        List<String> arananKelimelrList=new ArrayList<String>();
        arananKelimelrList.add("Status");
        arananKelimelrList.add("Stock");
        arananKelimelrList.add("Price");
        arananKelimelrList.add("Date");


        for (WebElement w: urunPage.statusStockBasliklari)
            if (arananKelimelrList.contains(w.getText())){
                softAssert.assertTrue(w.isDisplayed());
            }
        extentTest.info("Status ve Stock basliklarinin gorununurlugu test edildi");

        for (WebElement w: urunPage.priceDateBasliklari
             ) {
            if (arananKelimelrList.contains(w.getText())){
                softAssert.assertTrue(w.isDisplayed());
            }
        }
        extentTest.info("Price ve Date basliklarinin gorununurlugu test edildi");
        extentTest.pass("Urun listesi ve basliklar gorunur durumda");
        }
    }


