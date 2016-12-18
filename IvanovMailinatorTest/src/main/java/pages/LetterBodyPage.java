package pages;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Billy on 12/18/2016.
 */
public class LetterBodyPage extends Page {
    public LetterBodyPage(WebDriver driver) {
        super(driver);
    }

    public static final By byBody = By.xpath("//body");

    public void letterBodyAssertEquals(String letterText) {
        driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get().switchTo().frame("publicshowmaildivcontent");
        assertThat(driver.get().findElement(byBody).getText(), CoreMatchers.startsWith(letterText));
        driver.get().switchTo().defaultContent();
    }
}
