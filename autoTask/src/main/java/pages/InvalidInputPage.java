package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.ModifiedWaitUtils;

import static utils.ModifiedWaitUtils.*;

/**
 * Created by Billy on 12/14/2016.
 */
public class InvalidInputPage extends Page {
    public InvalidInputPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='content clear']")
    WebElement warning;
    public void warningAssertEquals(){
        Assert.assertEquals(waitForClickableElement(warning).getText(), "Неверный логин или пароль");
    }
}
