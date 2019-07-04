package cases.facebook.login;

import cases.Testable;

public class LoginFailed extends Login implements Testable {

    @Override
    public void test() {
        super.login("unknown@gmail.com", "test123");
    }
}
