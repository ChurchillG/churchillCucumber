package utils;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
public class ScreenshotUtils {
    public static void captureScreenshot(String screenshotName) {

        try {

            File sourceFile =
                    ((TakesScreenshot) DriverFactory.getDriver())
                            .getScreenshotAs(OutputType.FILE);

            File destination =
                    new File(
                            "test-output/screenshots/"
                                    + screenshotName
                                    + ".png"
                    );

            FileUtils.copyFile(sourceFile, destination);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
