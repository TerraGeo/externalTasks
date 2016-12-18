import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.io.File;

/**
 * Created by Billy on 12/18/2016.
 */
public class BaseTest {
    protected static final String letterText = "Hey, Mister! Nice weather outside!";
    protected static final String letterTextWithAdds = "Hey, Mister! Nice weather outside!\n" +
            "\n" +
            "-- реклама -----------------------------------------------------------\n" +
            "Поторопись зарегистрировать самый короткий почтовый адрес @i.ua\n" +
            "http://mail.i.ua/reg - и получи 1Gb для хранения писем";
    protected static final String addresser = "Сергей";
    protected static final String subject = "TestedText";
    protected static final String I_UALOGIN = "robLohkamp@i.ua";
    protected static final String I_UAPASSWORD = "private#49";
    protected static final String testBox = "qaGalProtector@mailinator.com";
    protected static final String driverPath = "drivers\\chromedriver.exe";
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
