package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaiterUtils.waitForClickableElement;

/**
 * Created by Billy on 12/18/2016.
 */
public class LetterSenderPage extends Page {
    public LetterSenderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//p[@class='make_message']/a")
    WebElement composeButton;
    @FindBy(name = "to")
    WebElement addressantField;
    @FindBy(name = "subject")
    WebElement subjectField;
    @FindBy(id = "text")
    WebElement emailField;
    @FindBy(xpath = "//input[@tabindex='12']")
    WebElement sendButton;

    public MailinatorStartPage sendLetter(String to, String subject, String text){
        waitForClickableElement(composeButton).click();
        addressantField.sendKeys(to);
        subjectField.sendKeys(subject);
        emailField.sendKeys(text);
        sendButton.click();
        return new MailinatorStartPage(Page.getDriver());
    }
}
