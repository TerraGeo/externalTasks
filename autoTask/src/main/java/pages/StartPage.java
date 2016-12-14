package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Billy on 12/14/2016.
 */
public class StartPage extends Page {
    public StartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(name = "login")
    WebElement loginField;
    @FindBy(name = "pass")
    WebElement passwordField;
    @FindBy(xpath = "//input[@tabindex='5']")
    WebElement submitButton;

    public AccountPage signIn(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        submitButton.click();
        return new AccountPage(Page.getDriver());
    }
    public InvalidInputPage incorrectSignIn(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        submitButton.click();
        return new InvalidInputPage(Page.getDriver());
    }
}
