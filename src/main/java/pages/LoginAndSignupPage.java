package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginAndSignupPage extends MethodHandles {
    public LoginAndSignupPage(WebDriver driver) {
        super(driver);
    }

    private final By signUpForm= By.xpath("//div[@class='signup-form']");
    private final By userNameField =By.xpath("//*[@placeholder='Name']");
    private final By signUpEmailField =By.xpath("//*[@data-qa='signup-email']");
    private final By signUpButton =By.cssSelector("button[data-qa='signup-button']");
    private final By loginForm = By.cssSelector("form[action='/login']");
    private final By loginEmailField =By.xpath("//*[@data-qa='login-email']");
    private final By loginPasswordFiled=By.xpath("//*[@placeholder='Password']");
    private final By loginButton=By.xpath("//button[normalize-space()='Login']");

    public Boolean signUpFormExist(){
       return isDisplayed(signUpForm,5);
    }
    public Boolean logInFormExist(){
        return isDisplayed(loginForm,5);
    }

   public AccountInfoPage clickSignup(){
        click(signUpButton,5);
       return new AccountInfoPage(driver);

   }

   private void setUserName( String username){
        clearFiled(userNameField);
        sendKeys(userNameField,5,username);
   }

   private void setEmail(String email){
        clearFiled(signUpEmailField);
        sendKeys(signUpEmailField,5,email);
   }



    private void setLoginEmail( String email){
        sendKeys(loginEmailField,5,email);
    }
    private void setLoginPassword(String password){
        sendKeys(loginPasswordFiled,5,password);
    }

    public HomePage clickLoginButton(){
        click(loginButton,5);
        return new HomePage(driver);
    }

    public void loginScript(String email, String password){
        setLoginEmail(email);
        setLoginPassword(password);

    }

    public void signUpFeature(String userName, String email){
       setUserName(userName);
       setEmail(email);

    }






}
