package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage {

    WebDriver driver;

    public signInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
    WebElement signIn_label;
    @FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
    WebElement create_acc_label;
    @FindBy(id = "email")
    WebElement enter_email;
    @FindBy(id = "pass")
    WebElement enter_password;
    @FindBy(xpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
    WebElement click_submit;
    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement cart_icon ;
    @FindBy(xpath = "//span[@class='base']")
    WebElement sign_In_page_header;


    public void enterEmail(String Email) {
        enter_email.sendKeys(Email);
    }
    public void enterPassword(String Password) {
        enter_password.sendKeys(Password);
    }
    public void clickSubmit() {
        click_submit.click();
    }

    public void loginValidCredentials(String email, String password) {
        enter_email.sendKeys(email);
        enter_password.sendKeys(password);
        click_submit.click();
    }
}
