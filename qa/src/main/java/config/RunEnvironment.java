package config;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        return driver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        RunEnvironment.driver = webDriver;
    }
}
