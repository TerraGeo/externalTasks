import org.testng.annotations.Test;

/**
 * Created by Billy on 12/18/2016.
 */
public class LetterTest extends BaseTest {
    @Test
    public void sendingLetterSubjectTest() throws Exception {
        iUaLogInPage.signIn(I_UALOGIN, I_UAPASSWORD)
                .sendLetter(testBox, subject, letterText)
                .searchSentLetter(testBox)
                .nameAndSubjectAssertEquals(subject, addresser);
    }

    @Test
    public void letterBodyTest() throws Exception {
        iUaLogInPage.signIn(I_UALOGIN, I_UAPASSWORD)
                .sendLetter(testBox, subject, letterText)
                .searchSentLetter(testBox)
                .clickOnLetter()
                .letterBodyAssertEquals(letterTextWithAdds);
    }
}
