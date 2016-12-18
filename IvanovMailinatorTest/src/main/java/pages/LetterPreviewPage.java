package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static utils.WaiterUtils.waitForClickableElement;

/**
 * Created by Billy on 12/18/2016.
 */
public class LetterPreviewPage extends Page {
    public LetterPreviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@title='FROM:']/div")
    WebElement addresserName;
    @FindBy(xpath = "//div[@class='innermail ng-binding']")
    List<WebElement> letterElements;

    public LetterBodyPage clickOnLetter(){

        waitForClickableElement(addresserName).click();
        return new LetterBodyPage(Page.getDriver());
    }
    public void nameAndSubjectAssertEquals(String letterSubject, String addresser){
        Assert.assertEquals(addresserName.getText(), addresser);
        Assert.assertEquals(letterElements.get(2).getText(), letterSubject);
    }
}
