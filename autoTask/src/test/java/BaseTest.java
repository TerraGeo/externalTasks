import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AccountPage;
import pages.InvalidInputPage;
import pages.Page;
import pages.StartPage;

import java.io.File;

/**
 * Created by Billy on 12/13/2016.
 */
public class BaseTest {
    protected String login = "robLohkamp@i.ua";
    protected String password = "private#49";
    protected StartPage startPage;
    protected InvalidInputPage invalidInputPage;
    protected AccountPage accountPage;

    @BeforeMethod
    public void setUp() throws Exception {
        File driverLocation =
                new File("D:\\Docs\\tasksEPAMExternal\\Automation\\autoTask\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", driverLocation.getAbsolutePath());
        startPage = new StartPage(new ChromeDriver());
        Page.getDriver().manage().window().maximize();
        Page.getDriver().get("http://www.i.ua/");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        if(Page.getDriver() != null)
            Page.getDriver().quit();
    }
}
