package tests.us_020;

import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_001_KullaniciBilgisiVeYorumu {

    TradylinnPage tradylinnPage;

        @Test
        public void test01() {

            tradylinnPage = new TradylinnPage();

            Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));

            tradylinnPage.anaSayfaGirisYapButonu.click();

            tradylinnPage.kullaniciAdiButonu.sendKeys(ConfigReader.getProperty("tradylinnValidKullaniciAdi"));

            tradylinnPage.parolaButonu.sendKeys(ConfigReader.getProperty("tradylinnValidParola"));

            tradylinnPage.girisYapButonu.click();

            tradylinnPage.hesabimButonu.click();

            tradylinnPage.storeManagerButonu.click();

            tradylinnPage.incelemelerButonu.click();

            tradylinnPage.productReviewsButonu.click();





        }
}
