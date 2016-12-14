import org.testng.annotations.Test;

/**
 * Created by Billy on 12/14/2016.
 */
public class IUaTest extends BaseTest {

    @Test
    public void loginTest() throws Exception {
        accountPage = startPage.signIn(login, password);
        accountPage.greetingsAssertEquals(login);
    }
    @Test
    public void invalidLoginTest() throws Exception {
        invalidInputPage = startPage.incorrectSignIn("blabla@fd.com", "catlover");
        invalidInputPage.warningAssertEquals();
    }
    @Test
    public void messageSendingTest() throws Exception {
        accountPage = startPage.signIn(login, password);
        accountPage.subjectAssertEquals(login);
    }

}
