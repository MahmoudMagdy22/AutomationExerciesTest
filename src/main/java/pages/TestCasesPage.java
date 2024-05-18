package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class TestCasesPage extends MethodHandles {
    public TestCasesPage(WebDriver driver) {
        super(driver);
    }
    private final By testCasesLogo = By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2/b");

    public boolean verifyTestCasesPage(){
        return isDisplayed(testCasesLogo,5);
    }

}
