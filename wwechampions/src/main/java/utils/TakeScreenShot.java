package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    static WebDriver driver = DriverFactory.getDriver();

    public static void takeScreen(String fileName)  {

        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        try {
            // src/main/resources
            // C:/Users/USER/IdeaProjects/wwechampions/src/main/resources/ScreenShots/
            FileUtils.copyFile(file,new File("src/main/resources/ScreenShots/"+ fileName +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
