package pages;

import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class MainPage {

    public MainPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
