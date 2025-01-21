package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addressBookPage {

    WebDriver driver;

    public addressBookPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath ="//span[@class='base']")
    WebElement addressBook_pageHeader;

    public String getAddressBookPageHeader() {
        return addressBook_pageHeader.getText();
    }


}
