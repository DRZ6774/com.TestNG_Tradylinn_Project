package tests.us_010;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001_RenkSecenekleri {

    TradylinnPage tradylinnPage;

    @Test
    public void test01() throws InterruptedException {
        tradylinnPage = new TradylinnPage();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        tradylinnPage.anaSayfaGirisYapButonu.click();

        tradylinnPage.kullaniciAdiButonu.sendKeys(ConfigReader.getProperty("tradylinnValidKullaniciAdi"));

        tradylinnPage.parolaButonu.sendKeys(ConfigReader.getProperty("tradylinnValidParola"));

        tradylinnPage.girisYapButonu.click();

        Thread.sleep(10000);

        tradylinnPage.hesabimButonu.click();

        tradylinnPage.storeManagerButonu.click();

        Thread.sleep(10000);

        tradylinnPage.urunButonu.click();

        tradylinnPage.pantolonButonu.click();

        tradylinnPage.attributesButonu.click();

        tradylinnPage.colorKutucugu.click();

        tradylinnPage.colorArama.click();






    }
}
