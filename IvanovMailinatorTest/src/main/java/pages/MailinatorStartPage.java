package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.WaiterUtils.waitForClickableElement;

/**
 * Created by Billy on 12/18/2016.
 */
public class MailinatorStartPage extends Page {
    public MailinatorStartPage(WebDriver driver) {
        super(driver);
    }
    protected static final String testBoxName = "qaGalProtector";

    @FindBy(id = "inboxfield")
    WebElement letterSearchField;
    @FindBy(xpath = "//button[@class='btn btn-dark']")
    WebElement searchLetterButton;

    public LetterPreviewPage searchSentLetter(){
        Page.getDriver().get("https://www.mailinator.com/");
        waitForClickableElement(letterSearchField).sendKeys(testBoxName);
        searchLetterButton.click();
        return new LetterPreviewPage(Page.getDriver());
    }
}
