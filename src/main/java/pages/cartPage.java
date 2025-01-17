package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {

    WebDriver driver;

    public cartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
    WebElement checkout_button;
    @FindBy(xpath = "//a[@title='Remove item']")
    WebElement remove_icon;
    @FindBy(xpath = "//span[@role='tab']")
    WebElement details_arrow;
}
