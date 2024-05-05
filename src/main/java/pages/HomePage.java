package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private final By homeIcon = By.cssSelector("div[class='item active'] div[class='col-sm-6'] h2");
    private final By signInAndLoginButton = By.xpath("//*[@id='header']//li[1]//a[1]");
    private final By loggedInAsUserName =By.xpath("//i[@class='fa fa-user']");
    private final By deleteAccountButton=By.xpath("//a[normalize-space()='Delete Account']");

    public void validateLogInUser(){
        isDisplayed(loggedInAsUserName,10);
    }

    public DeleteAccountPage clickDeleteAccountButton(){
        click(deleteAccountButton,5);
        return new DeleteAccountPage(driver);
    }
    public boolean verifyHomePage(){
        return isDisplayed(homeIcon,5);
    }
    public LoginAndSignupPage clickOnLoginButton(){
        moveToElementAndClick(signInAndLoginButton,5);
        return new LoginAndSignupPage(driver);
    }

    public LoginAndSignupPage homePageScript(){
        verifyHomePage();
        clickOnLoginButton();
        return new LoginAndSignupPage(driver);
    }
}
