package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ModifiedWaitUtils;

import java.util.List;

import static utils.ModifiedWaitUtils.*;

/**
 * Created by Billy on 12/14/2016.
 */
public class AccountPage extends Page {
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    WebElement greetings;
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
    @FindBy(xpath = "//li[@class='new']/a")
    WebElement inboxButton;
    @FindBy(xpath = "//span[@class='sbj']/span")
    List<WebElement> letterSubjects;

    public void greetingsAssertEquals(String login){
        Assert.assertEquals(waitForClickableElement(greetings).getText(), login);
    }
    public void subjectAssertEquals(String login){
        String subject = "TestLetter3";
        waitForClickableElement(composeButton).click();
        addressantField.sendKeys(login);
        subjectField.sendKeys(subject);
        emailField.sendKeys("Self Greetings");
        sendButton.click();
        waitForClickableElement(inboxButton).click();
        Assert.assertEquals(letterSubjects.get(0).getText(), subject);
    }
}
