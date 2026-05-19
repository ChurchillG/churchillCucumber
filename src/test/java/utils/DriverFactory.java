package utils;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {

            String browser =
                    System.getProperty(
                            "browser",
                            ConfigReader
                                    .getProperties()
                                    .getProperty("browser")
                    );

            switch (browser.toLowerCase()) {

                case "firefox":

                    WebDriverManager.firefoxdriver().setup();

                    driver = new FirefoxDriver();

                    break;

                case "edge":

                    WebDriverManager.edgedriver().setup();

                    driver = new EdgeDriver();

                    break;

                case "chrome":
                default:

                    WebDriverManager.chromedriver().setup();

                    driver = new ChromeDriver();

                    break;
            }

            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(
                    Duration.ofSeconds(
                            Integer.parseInt(
                                    ConfigReader
                                            .getProperties()
                                            .getProperty("implicitWait")
                            )
                    )
            );
        }

        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {

            driver.quit();

            driver = null;
        }
    }
}
