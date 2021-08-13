package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
    static Wait<WebDriver> wait;

    public static void waitUntilElementIsVisible(WebElement element){

        wait = new WebDriverWait(DriverFactory.getDriver(),10);
        System.out.println("Waiting element for visible: "+ element);
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println("Element is visible: "+ element);
    }

    public static void  waitUntilElementIsClickable(WebElement element){

        wait = new WebDriverWait(DriverFactory.getDriver(),10);
        System.out.println("Waiting element for click: "+ element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        System.out.println("Element is clickable: "+ element);
    }


    public static void  waitImplicitly(){
        System.out.println("Wait implicitly start: ");
        wait = new WebDriverWait(DriverFactory.getDriver(),10);
        try {
            wait.wait(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
