package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class AccountInfoPage extends MethodHandles {
    public AccountInfoPage(WebDriver driver) {
        super(driver);
    }

    private final By accountInfoTitle = By.xpath("//b[normalize-space()='Enter Account Information']");

    private final By MrButton= By.xpath("//*[@id='id_gender1']");
   // private final By MrsButton= By.xpath("//*[@id='id_gender2']");

    private final By firstNameField =By.cssSelector("#first_name");
    private final By lastNameFiled = By.cssSelector("#last_name");
    private final By companyField =By.cssSelector("#company");
    private final By addressField =By.cssSelector("#address1");
    private final By countryDropDownList = By.cssSelector("#country");
    private final By stateField =By.cssSelector("#state");
    private final By cityField = By.cssSelector("#city");
    private final By zipCodeFiled =By.cssSelector("#zipcode");
    private final By mobileNumberField =By.cssSelector("#mobile_number");

    private final By createAccountButton=By.cssSelector("button[data-qa='create-account']");

    private void setFirstName(String firstName){
        sendKeys(firstNameField,5,firstName);
    }
    private void setLastName(String lastName){
        sendKeys(lastNameFiled,5,lastName);
    }
    private void setCompanyName(String company){
        sendKeys(companyField,5,company);
    }
    private void setFirstAddress(String address){
        sendKeys(addressField,5,address);
    }
    private void setState(String state){
        sendKeys(stateField,5,state);
    }
    private void setCity(String city){
        sendKeys(cityField,5,city);
    }
    private void setMobileNumber(String mobileNumber){
        sendKeys(mobileNumberField,5,mobileNumber);
    }
    private void setZipcode(String zipCode){
        sendKeys(zipCodeFiled,5,zipCode);
    }
    private void selectCounty(String county){
    selectFromDropdown(countryDropDownList,county,5);
    }



    private final By passwordField =By.cssSelector("#password");

    private final By dropDownDays = By.xpath("//*[@id='days']");
    private final By dropDownMonths= By.xpath("//*[@id='months']");
    private final By dropDownYears=By.xpath("//*[@id='years']");
    private final By newsletterButton = By.xpath("//*[@name='newsletter']");
    private final By SpecialOffersButton = By.xpath("//input[@id='optin']");


    public boolean VerifyAccountInfoTitleVisible (){
        return isDisplayed(accountInfoTitle,5);
    }


    private void enterBirthDate(){
        selectFromDropdown(dropDownDays,"19",5);
        selectFromDropdown(dropDownMonths,"4",5);
        selectFromDropdown(dropDownYears,"1987",5);

    }

    private void selectTitle(){
        selectRadioButton(driver,MrButton,5);
    }

     private void enterPassword(String password){
        clearFiled(passwordField);
        sendKeys(passwordField,5,password);
    }
    private void clickNewsletterButton(){
        click(newsletterButton,5);
    }

    private void clickSpecialOfferButton(){
        click(SpecialOffersButton,5);
    }

    public void enterAccountInfoFeature(String password){
        selectTitle();
        enterPassword(password);
        enterBirthDate();
        clickNewsletterButton();
        clickSpecialOfferButton();
            }

    public AccountCreatedPage clickCreateAccountButton(){
        click(createAccountButton,5);
        return new AccountCreatedPage(driver);
    }

    public void addressInformationFeature(String firstName,String lastName, String company, String address, String state,
                                          String city, String mobileNumber, String zipcode, String country){
        setFirstName(firstName);
        setLastName(lastName);
        setCompanyName(company);
        setFirstAddress(address);
        selectCounty(country);
        setState(state);
        setCity(city);
        setZipcode(zipcode);
        setMobileNumber(mobileNumber);
    }







}
