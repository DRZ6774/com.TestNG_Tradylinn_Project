package tests.us_010;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001  {

    TradylinnPage tradylinnPage;
   // Actions actions=new Actions(Driver.getDriver());

    @Test
    public void renkSecenegi() throws InterruptedException {
        new TradylinnPage();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        tradylinnPage.anaSayfaGirisYapButonu.click();

        tradylinnPage.kullaniciAdiButonu.sendKeys(ConfigReader.getProperty("tradylinnValidKullaniciAdi"));
        Thread.sleep(5000);

        tradylinnPage.parolaButonu.sendKeys(ConfigReader.getProperty("tradylinnValidParola"));
        //actions.click(tradylinnPage.parolaButonu).sendKeys(ConfigReader.getProperty("tradylinnValidParola")).perform();

        tradylinnPage.girisYapButonu.click();

        tradylinnPage.hesabimButonu.click();

        tradylinnPage.storeManagerButonu.click();

        tradylinnPage.urunButonu.click();

        tradylinnPage.pantolonButonu.click();

        tradylinnPage.attributesButonu.click();

        tradylinnPage.colorKutucugu.click();

        tradylinnPage.colorArama.click();






    }
}
