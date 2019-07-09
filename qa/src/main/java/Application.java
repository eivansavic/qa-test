import test.cases.facebook.login.LoginFailed;
import test.environment.JUnitCoreEnvironment;
import test.environment.RunnableEnvironment;

public class Application {

    private static final Class[] classes = {
            LoginFailed.class
    };

    public static void main(String[] args) {
        RunnableEnvironment environment = new JUnitCoreEnvironment();
        environment.runAll(classes);
    }
}
