package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class DeleteAccountPage extends MethodHandles {
    public DeleteAccountPage(WebDriver driver) {
        super(driver);
    }
    private final By deleteAccountMessage= By.xpath("//h2[@class='title text-center']");

    private final By continueButton=By.cssSelector(".btn.btn-primary");

    public void deleteAccountMessageVisible(){
        isDisplayed(deleteAccountMessage,5);
            }
    public HomePage clickContinueButton(){
        click(continueButton,5);
        return new HomePage(driver);
    }


}
