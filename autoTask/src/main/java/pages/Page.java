package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Billy on 12/14/2016.
 */
public abstract class Page {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver(){return driver.get();}


    public Page (WebDriver driver){
        this.driver.set(driver);
        PageFactory.initElements(this.driver.get(), this);
    }
}
