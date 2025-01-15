package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class editAccountPage {

    WebDriver driver;

    public editAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//span[@class='base']")
    WebElement editAccount_pageHeader;

    public String geteditAccountPageHeader() {
        return editAccount_pageHeader.getText();
    }

}
