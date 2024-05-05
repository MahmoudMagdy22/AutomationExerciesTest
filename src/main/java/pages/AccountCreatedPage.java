package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class AccountCreatedPage extends MethodHandles {
    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    private final By accountCreatedMessage=By.cssSelector("h2[class='title text-center'] b");
    private final By continueButton=By.linkText("Continue");

    public HomePage clickContinueButton(){
        click(continueButton,5);
        return new HomePage(driver);
    }
    public void VerifyVisibilityOfAccountCreatedMessage(){
        isDisplayed(accountCreatedMessage,5);
    }
}
