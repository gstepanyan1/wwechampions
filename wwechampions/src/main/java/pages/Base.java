package pages;

import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class Base {

    public static final String BASE_URL = "https://wwechampions.com/";
    public Base() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
