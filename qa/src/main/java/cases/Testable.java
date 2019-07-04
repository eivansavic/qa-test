package cases;

import config.EnvironmentManager;
import org.junit.Assert;


public interface Testable {

    default void init() {
        EnvironmentManager.initWebDriver("chrome");
    }

    default void test() {
        Assert.fail();
    }

    default void quit() {
        EnvironmentManager.shutDownDriver();
    }
}
