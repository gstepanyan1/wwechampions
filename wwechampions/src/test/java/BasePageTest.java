import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utils.*;

public class BasePageTest extends BaseTest{
    @Test
    void loginUpToIdScopelyPage(){
        BasePage basePage = new BasePage();
        VideoRecord.startRecord("login_up_to_idScopelypage");
        DriverFactory.getDriver().get(basePage.BASE_URL);
        ActionHelper.clickOnElement(basePage.getProfileButton());
        ActionHelper.clickOnElement(basePage.getLoginButton());
        ActionHelper.clickOnElement(basePage.getLoginWithScopelyid());
        TakeScreenShot.takeScreen("scopely_id_page");
        String expected = "https://id.scopely.com/";
        Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().equals(expected),"Scopely id url not opened");
        VideoRecord.stopRecord();
    }
}
