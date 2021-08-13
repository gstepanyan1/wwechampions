import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.IdScopelyPage;
import utils.*;

import java.util.concurrent.TimeUnit;

public class IdScopelyPageTest extends BaseTest{

    @Test
    void loginScopelyId(){
        VideoRecord.startRecord("login_scopelyid");
        IdScopelyPage scopelyPage = new IdScopelyPage();
        DriverFactory.getDriver().get(scopelyPage.url);
        ActionHelper.sendKeyAction(scopelyPage.getUserName(),"g.stepanyan@yahoo.com");
        ActionHelper.clickOnElement(scopelyPage.getUserPass());
        ActionHelper.sendKeyAction(scopelyPage.getUserPass(), "Aa123456");
        ActionHelper.clickOnElement(scopelyPage.getSubmitButton());
        //DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sleep(10);
        TakeScreenShot.takeScreen("after_login_scopelyid");
        Assert.assertTrue(scopelyPage.getElementForCheck().getText().equals("HOME"));
        VideoRecord.stopRecord();
    }

    @Test
    void loginFullFlow(){
        IdScopelyPage scopelyPage = new IdScopelyPage();
        BasePage basePage = new BasePage();
        VideoRecord.startRecord("login_full_flow");
        DriverFactory.getDriver().get(basePage.BASE_URL);
        ActionHelper.clickOnElement(basePage.getProfileButton());
        ActionHelper.clickOnElement(basePage.getLoginButton());
        ActionHelper.clickOnElement(basePage.getLoginWithScopelyid());
        ActionHelper.sendKeyAction(scopelyPage.getUserName(),"g.stepanyan@yahoo.com");
        ActionHelper.clickOnElement(scopelyPage.getUserPass());
        ActionHelper.sendKeyAction(scopelyPage.getUserPass(), "Aa123456");
        ActionHelper.clickOnElement(scopelyPage.getSubmitButton());
        //TakeScreenShot.takeScreen("after_login_full");
        sleep(15);
        TakeScreenShot.takeScreen("afterLoginMainPage");
        Assert.assertTrue(scopelyPage.getUser().getText().equals("Champion25095"));
        ActionHelper.clickOnElement(scopelyPage.getOpenProfile());
        ActionHelper.clickOnElement(scopelyPage.getAccountShowProfile());
        ActionHelper.clickOnElement(scopelyPage.getChangeAvatar());
        ActionHelper.clickOnElement(scopelyPage.getSecondAvatar());
        ActionHelper.clickOnElement(scopelyPage.getApplyButton());
        ActionHelper.clickOnElement(scopelyPage.getOpenProfile());
        ActionHelper.clickOnElement(scopelyPage.getAccountShowProfile());
        ActionHelper.clickOnElement(scopelyPage.getLogoutButton());
        TakeScreenShot.takeScreen("afterLogoutMainPage");
        ActionHelper.clickOnElement(basePage.getProfileButton());
        sleep(2);
        Assert.assertTrue(basePage.getProfileAndEvent().getText().equals("Profile & Events"));
        VideoRecord.stopRecord();
    }




}
