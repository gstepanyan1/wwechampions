package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends Base{



    //     //aside[2]/div[1]/div/button
    @FindBy(xpath = "//aside[2]/div[2]/button")
    private WebElement loginButton;

    //   //button[@data-id='scopely_login']
    @FindBy(xpath = "//button/div/span")
    private WebElement loginWithScopelyid;


    @FindBy(xpath = "//li[@data-id='undefined_header_player_profile']")
    private WebElement profileButton;

    @FindBy(xpath = "//aside[2]//h5")
    private WebElement profileAndEvent;



    public  WebElement getLoginButton(){
        return loginButton;
    }

    public  WebElement getLoginWithScopelyid(){
        return loginWithScopelyid;
    }

    public WebElement getProfileButton(){
        return profileButton;
    }

    public WebElement getProfileAndEvent(){
        return profileAndEvent;
    }
}
