package tests.us_010;

import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_002 {

    TradylinnPage tradylinnPage;

    @Test
    public void sizeSecenegi() {

        new TradylinnPage();

        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

        tradylinnPage.anaSayfaGirisYapButonu.click();

        tradylinnPage.kullaniciAdiButonu.sendKeys(ConfigReader.getProperty("tradylinnValidKullaniciAdi"));

        tradylinnPage.parolaButonu.sendKeys(ConfigReader.getProperty("tradylinnValidParola"));

        tradylinnPage.girisYapButonu.click();

        tradylinnPage.hesabimButonu.click();

        tradylinnPage.storeManagerButonu.click();

        tradylinnPage.urunButonu.click();

        tradylinnPage.pantolonButonu.click();

        tradylinnPage.attributesButonu.click();

        tradylinnPage.sizeKutucugu.click();

        tradylinnPage.sizeArama.click();






    }
}