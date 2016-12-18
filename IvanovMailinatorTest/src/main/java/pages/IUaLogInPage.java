package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Billy on 12/18/2016.
 */
public class IUaLogInPage extends Page {
    public IUaLogInPage(WebDriver driver) {
        super(driver);
    }
    protected static final String I_UALOGIN = "robLohkamp@i.ua";
    protected static final String I_UAPASSWORD = "private#49";

    @FindBy(name = "login")
    WebElement loginField;
    @FindBy(name = "pass")
    WebElement passwordField;
    @FindBy(xpath = "//input[@tabindex='5']")
    WebElement submitButton;
    public LetterSenderPage signIn(){
        loginField.sendKeys(I_UALOGIN);
        passwordField.sendKeys(I_UAPASSWORD);
        submitButton.click();
        return new LetterSenderPage(Page.getDriver());
    }
}
