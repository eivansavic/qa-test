package test.environment;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;

public class JUnitCoreEnvironment implements RunnableEnvironment {

    private static JUnitCore jUnitCore = null;

    public JUnitCoreEnvironment() {
        if(jUnitCore == null) {
            jUnitCore = new JUnitCore();
            jUnitCore.addListener(new TextListener(System.out));
        }
    }

    @Override
    public void runAll(Class[] testClasses) {
        jUnitCore.run(testClasses);
    }

    @Override
    public void runEach(Class testClass) {
        jUnitCore.run(testClass);
    }
}
