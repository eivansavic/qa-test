package cases;

import cases.facebook.login.LoginFailed;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class TestEnvironment {

    private static final Logger logger = LogManager.getLogger(TestEnvironment.class);


    private static Class[] classes = {
            LoginFailed.class
    };

    public static void runAll() {
        Arrays.stream(TestEnvironment.classes).forEach(TestEnvironment::runEach);
    }

    public static void runEach(Class clazz) {
        final Testable test;
        try {
            test = (Testable) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            logger.info("Not executed: " + clazz.getName());
            return;
        }
        test.init();
        test.test();
        test.quit();
    }
}
