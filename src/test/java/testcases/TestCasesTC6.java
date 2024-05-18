package testcases;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pages.TestCasesPage;

public class TestCasesTC6 extends BaseTest {

    @Test
    public void testCasesFun(){
         TestCasesPage testCasesPage =homePage.clickOnTestCasesButton();

         boolean actualResult =testCasesPage.verifyTestCasesPage();
         boolean expectedResult= true;

    }
}
