package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IdScopelyPage extends Base{

    public final String url = "https://id.scopely.com/";

    @FindBy(xpath = "//input[@id='okta-signin-username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='okta-signin-password']")
    private WebElement userPass;

    @FindBy(xpath = "//input[@id='okta-signin-submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div/ul/li[1]/a")
    private WebElement elementForCheck;

    @FindBy(xpath = "//a[@data-id='current_user_name_link_to_player_profile']")
    private WebElement user;

    @FindBy(xpath = "//li/div/div[2]/span")
    private WebElement openProfile;

    @FindBy(xpath = "//div[@data-id='account_profile_settings_show_button']")
    private WebElement accountShowProfile;

    @FindBy(xpath = "//li[1]/p")
    private WebElement changeAvatar;

    @FindBy(xpath = "//div[4]//div/div[2]/div[2]/div[1]/div/div")
    private  WebElement firstAvatar;

    @FindBy(xpath = "//div[2]//div[2]/div[2]/div[2]/div/div")
    private WebElement secondAvatar;

    @FindBy(xpath = "//button[@data-id='avatar_change_apply_button']")
    private WebElement applyButton;

    @FindBy(xpath = "//li[3]/p")
    private WebElement logoutButton;



    public  WebElement getUserName(){
        return userName;
    }

    public  WebElement getUserPass(){
        return userPass;
    }

    public WebElement getSubmitButton(){
        return submitButton;
    }

    public WebElement getElementForCheck(){
        return elementForCheck;
    }

    public WebElement getUser(){
        return user;
    }

    public  WebElement getOpenProfile(){
        return openProfile;
    }

    public WebElement getAccountShowProfile(){
        return accountShowProfile;
    }

    public WebElement getChangeAvatar(){
        return changeAvatar;
    }

    public WebElement getFirstAvatar(){
        return firstAvatar;
    }

    public WebElement getSecondAvatar(){
        return secondAvatar;
    }

    public WebElement getApplyButton(){
        return applyButton;
    }

    public WebElement getLogoutButton(){
        return logoutButton;
    }



}
