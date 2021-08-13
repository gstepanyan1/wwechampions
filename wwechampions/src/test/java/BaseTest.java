import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;
import utils.DriverFactory;

public class BaseTest {

    @BeforeMethod
    void driverSetup(){
        DriverFactory.initDriver(Browser.CHROME);

    }

    @AfterMethod
    void driverQuite(){
        DriverFactory.quitDriver();

    }

    public void sleep(int sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
