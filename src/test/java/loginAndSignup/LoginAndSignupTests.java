package loginAndSignup;


import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.AccountCreatedPage;
import pages.AccountInfoPage;
import pages.DeleteAccountPage;
import pages.LoginAndSignupPage;


public class LoginAndSignupTests extends BaseTest {
    @Test
    public void signUpTest() {
        homePage.verifyHomePage();

        LoginAndSignupPage loginAndSignupPage = homePage.clickOnLoginButton();
        loginAndSignupPage.signUpFormExist();
        loginAndSignupPage.signUpFeature("mahmoud","mmagde22@yahoo.com");


        AccountInfoPage accountInfoPage= loginAndSignupPage.clickSignup();
        accountInfoPage.VerifyAccountInfoTitleVisible();
        accountInfoPage.enterAccountInfoFeature("My password");
        accountInfoPage.addressInformationFeature("mahmoud","magdy","Entra",
                "Elbadrasheen", "Giza","Giza","01144503868","12355","Canada" );

        AccountCreatedPage accountCreatedPage =accountInfoPage.clickCreateAccountButton();
        accountCreatedPage.VerifyVisibilityOfAccountCreatedMessage();
        accountCreatedPage.clickContinueButton();
        homePage.validateLogInUser();
        DeleteAccountPage deleteAccountPage = homePage.clickDeleteAccountButton();
        deleteAccountPage.deleteAccountMessageVisible();
        homePage = deleteAccountPage.clickContinueButton();
            }


}
