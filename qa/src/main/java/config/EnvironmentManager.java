package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class EnvironmentManager {

    public static void initWebDriver(BROWSER browser) {
        final WebDriver driver = initDriver(browser);
        RunEnvironment.setWebDriver(driver);
    }

    public static void shutDownDriver() {
        RunEnvironment.getWebDriver().quit();
    }

    private static WebDriver initDriver(BROWSER browser) {
        switch (browser) {
            case CHROME:
                return new ChromeDriver();
            case EXPLORER:
                return new InternetExplorerDriver();
            case FIREFOX:
                return new FirefoxDriver();
            default:
                return null;
        }
    }

    public enum BROWSER {
        CHROME, FIREFOX, EXPLORER
    }
}
