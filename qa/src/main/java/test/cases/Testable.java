package test.cases;

import config.EnvironmentManager;
import org.junit.Assert;


public interface Testable {

    default void init() {
        EnvironmentManager.initWebDriver(EnvironmentManager.BROWSER.CHROME);
    }

    default void test() {
        Assert.fail();
    }

    default void quit() {
        EnvironmentManager.shutDownDriver();
    }
}
