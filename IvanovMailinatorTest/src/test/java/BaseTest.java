import listeners.ListenerForTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

import java.io.File;

/**
 * Created by Billy on 12/18/2016.
 */
@Listeners(ListenerForTest.class)
public class BaseTest {

    private static final String driverPath = "drivers\\chromedriver.exe";
    protected IUaLogInPage iUaLogInPage;
    protected LetterSenderPage letterSenderPage;
    protected MailinatorStartPage mailinatorStartPage;
    protected LetterPreviewPage letterPreviewPage;
    protected LetterBodyPage letterBodyPage;

    @BeforeMethod
    public void setUp() throws Exception {
        File driverLocation = new File(driverPath);
        System.setProperty("webdriver.chrome.driver", driverLocation.getAbsolutePath());
        iUaLogInPage = new IUaLogInPage(new ChromeDriver());
        Page.getDriver().manage().window().maximize();
        Page.getDriver().get("http://www.i.ua/");
    }


    @AfterMethod
    public void tearDown() throws Exception {
        if(Page.getDriver() != null)
            Page.getDriver().quit();
    }
}
