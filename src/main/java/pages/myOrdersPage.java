package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myOrdersPage {

    WebDriver driver;
    public myOrdersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath ="//span[@class='base']")
    WebElement myOrders_pageHeader;


    public String getMyOrders_pageHeader() {
        return myOrders_pageHeader.getText();
    }
}
