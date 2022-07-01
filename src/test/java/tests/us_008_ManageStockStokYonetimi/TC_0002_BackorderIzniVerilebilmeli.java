package tests.us_008_ManageStockStokYonetimi;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.StoreManagerPage;
import pages.UrunPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;
import java.util.ArrayList;
import java.util.List;

public class TC_0002_BackorderIzniVerilebilmeli extends TestBaseReport {
   @Test
    public void testTC_0002()  {


       MainPage mainPage;
       UrunPage urunPage;
       StoreManagerPage storeManagerPage;
       JavascriptExecutor jse;


       extentTest = extentReports.createTest("Backorder izni verilebilmeli, gecici verilmeme optionu olmalı veya verilmeli ama müşteri bilgilendirilmeli");

       mainPage=new MainPage();
       urunPage =new UrunPage();
       storeManagerPage=new StoreManagerPage();
       jse = (JavascriptExecutor)Driver.getDriver();


       //1-https://tradylinn.com/ sitesine gidiniz.
       ReusableMethods.waitFor(5);
       Driver.getDriver().navigate().to(ConfigReader.getProperty("mainPage"));
       extentTest.info("https://www.tradylinn.com sitesine gidildi");

       //2-Giriş yap/üye ol butonuna basınız.
       ReusableMethods.waitFor(5);
       mainPage.girisYap_UyeOlSekmesi.click();
       extentTest.info("Girisyap/Uye ol sekmesine tiklandi");

       //3-Gecerli username giriniz.
       ReusableMethods.waitFor(10);
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
       jse.executeScript("arguments[0].scrollIntoView()",  urunPage.storeManager);
       jse.executeScript("arguments[0].click();",urunPage.storeManager );
       extentTest.info("Store manager sekmesine tiklandi");

       //8- urunler sekmesine tiklayin
       ReusableMethods.waitFor(5);
       jse.executeScript("arguments[0].scrollIntoView()",  urunPage.urun);
       jse.executeScript("arguments[0].click();",urunPage.urun );
       extentTest.info("Urunler sekmesine tiklandi");

       //9- t-shirt ürününe tıklayınız
       ReusableMethods.waitFor(5);
       jse.executeScript("arguments[0].scrollIntoView()",  storeManagerPage.tshirt);
       jse.executeScript("arguments[0].click();",storeManagerPage.tshirt );
       extentTest.info("T-shirt butonuna tıklandı");

       //10-managestock sekmesi tiklayiniz.
       ReusableMethods.waitFor(5);
      jse.executeScript("arguments[0].scrollIntoView()",  storeManagerPage.manageStock);
      jse.executeScript("arguments[0].click();",storeManagerPage.manageStock );
      jse.executeScript("arguments[0].scrollIntoView()",  storeManagerPage.manageStock);
      jse.executeScript("arguments[0].click();",storeManagerPage.manageStock );
      extentTest.info("manegeStock sekmesi tiklandi");

       //11-stockQty alanına urun-stok miktari giriniz.
       ReusableMethods.waitFor(5);
       storeManagerPage.stockQty.clear();
       storeManagerPage.stockQty.sendKeys("10");
       extentTest.info("stockQty alanına urun miktari-stok girildi");

       //12-Backorder izni verilebilmeli, gecici verilmeme optionu olmalı veya verilmeli ama müşteri bilgilendirilmeli
       ReusableMethods.waitFor(5);
       storeManagerPage.allowBackorders.click();
       extentTest.info("Backorder izni verdi");

       ReusableMethods.waitFor(5);
       Select select=new Select(storeManagerPage.allowBackorders);
       select.getAllSelectedOptions();
       List<WebElement> requestedListesi=select.getOptions();
       List<String>opsiyonlar=new ArrayList<>();
       for (int i = 0; i < requestedListesi.size(); i++) {
           opsiyonlar.add(requestedListesi.get(i).getText());
       }
       System.out.println(opsiyonlar);

       List<String>expectedBackordersListesi=new ArrayList<>();
       expectedBackordersListesi.add("Allow");
       expectedBackordersListesi.add("Do not Allow");
       expectedBackordersListesi.add("Allow, but notify customer");


       //13-Backorder izni verildigini, gecici verilmeme optionu oldugunu veya verildigini ama müşteri bilgilendirildigini kontrol ediniz.
       Assert.assertTrue(expectedBackordersListesi.containsAll(opsiyonlar));
       extentTest.info("stockQty alanına urun-stok miktarini kontrol edildi");

    }
}