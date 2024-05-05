package home;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.LoginAndSignupPage;

public class HomeTest extends BaseTest {

    @Test
    public void homeTestFun(){
        homePage.homePageScript();
        LoginAndSignupPage loginAndSignupPage = new LoginAndSignupPage(driver);
        loginAndSignupPage.signUpFormExist();

    }

}
