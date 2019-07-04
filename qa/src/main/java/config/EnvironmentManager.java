package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EnvironmentManager {

    public static void initWebDriver(String browser) {
        final WebDriver driver = initDriver(browser);
        RunEnvironment.setWebDriver(driver);
    }

    public static void shutDownDriver() {
        RunEnvironment.getWebDriver().quit();
    }

    private static WebDriver initDriver(String browser) {
        switch (browser) {
            case "chrome":
                return new ChromeDriver();
            case "explorer":
                return new InternetExplorerDriver();
            case "firefox":
                return new FirefoxDriver();
            default:
                return null;
        }
    }
}
