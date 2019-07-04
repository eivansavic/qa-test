package cases.facebook.login;

import config.RunEnvironment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class Login {

    private static final String URL = "https://www.facebook.com";

    void login(String email, String password) {
        final WebDriver driver = RunEnvironment.getWebDriver();
        driver.get(URL);

        final WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(email);

        final WebElement passwordInput = driver.findElement(By.id("pass"));
        passwordInput.sendKeys(password);

        final WebElement loginButton = driver.findElement(By.id("u_0_2"));
        loginButton.click();
    }
}
