import org.testng.annotations.Test;

/**
 * Created by Billy on 12/18/2016.
 */
public class LetterTest extends BaseTest {
    @Test
    public void sendingLetterSubjectTest(){
        iUaLogInPage.signIn()
                .sendLetter()
                .searchSentLetter()
                .nameAndSubjectAssertEquals();
    }

    @Test
    public void letterBodyTest() {
        iUaLogInPage.signIn()
                .sendLetter()
                .searchSentLetter()
                .clickOnLetter()
                .letterBodyAssertEquals();
    }
}
