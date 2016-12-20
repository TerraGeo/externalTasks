import listeners.ReportListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;
import utils.PropertiesConfig;

import java.io.File;

import static utils.PropertiesConfig.getInstance;

/**
 * Created by Billy on 12/18/2016.
 */
@Listeners(ReportListener.class)
public class BaseTest {

    protected IUaLogInPage iUaLogInPage;
    protected LetterSenderPage letterSenderPage;
    protected MailinatorStartPage mailinatorStartPage;
    protected LetterPreviewPage letterPreviewPage;
    protected LetterBodyPage letterBodyPage;

    @BeforeMethod
    public void setUp() {
        iUaLogInPage = new IUaLogInPage(new ChromeDriver());
        Page.getDriver().manage().window().maximize();
        Page.getDriver().get(getInstance().getHomePage());
    }


    @AfterMethod
    public void tearDown() {
        if(Page.getDriver() != null)
            Page.getDriver().quit();
    }
}
