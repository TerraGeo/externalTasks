package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PropertiesConfig;

/**
 * Created by Billy on 12/18/2016.
 */
public class IUaLogInPage extends Page {
    public IUaLogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "login")
    WebElement loginField;
    @FindBy(name = "pass")
    WebElement passwordField;
    @FindBy(xpath = "//input[@tabindex='5']")
    WebElement submitButton;
    public LetterSenderPage signIn(){
        loginField.sendKeys(PropertiesConfig.getInstance().getIuaLogin());
        passwordField.sendKeys(PropertiesConfig.getInstance().getIuaPassword());
        submitButton.click();
        return new LetterSenderPage(Page.getDriver());
    }
}
