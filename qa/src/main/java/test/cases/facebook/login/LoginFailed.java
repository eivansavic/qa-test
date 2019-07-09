package test.cases.facebook.login;

import test.cases.Testable;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginFailed extends Login implements Testable {

    @Before
    public void setup() {
        this.init();
    }

    @Test
    @Override
    public void test() {
        WebDriver driver = super.login("unknown@gmail.com", "test123");
        Assert.assertTrue(driver.getCurrentUrl().contains("login"));
    }

    @After
    public void finish() {
        this.quit();
    }
}