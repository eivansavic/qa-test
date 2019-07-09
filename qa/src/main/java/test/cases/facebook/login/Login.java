package test.cases.facebook.login;

import config.RunEnvironment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.validation.constraints.NotNull;

class Login {

    private static final String URL = "https://www.facebook.com";

    WebDriver login(@NotNull String email, @NotNull String password) {
        final WebDriver driver = RunEnvironment.getWebDriver();
        driver.get(URL);

        final WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(email);

        final WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys(password);
        passwordInput.submit();

        return driver;
    }
}
