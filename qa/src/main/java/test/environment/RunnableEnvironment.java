package test.environment;

public interface RunnableEnvironment {

    void runAll(Class[] testClasses);

    void runEach(Class testClass);
}
