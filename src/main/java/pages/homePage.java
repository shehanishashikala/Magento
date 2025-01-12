package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //    Elements
    @FindBy(xpath = "//span[@class='base']")
    WebElement homePage_header;
    @FindBy(xpath = "//span[@class='customer-name active']//button[@type='button']")
    WebElement arrow_icon;
    @FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='My Account']")
    WebElement myAccount_label;
    @FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='My Wish List']")
    WebElement myWishList_label;
    @FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
    WebElement signOut_label;
    @FindBy(xpath = "//span[@class='action more button']")
    WebElement shopNewYoga_link;

    @FindBy(xpath = "//img[@alt='Radiant Tee']")
    WebElement radiantTee_img;
    @FindBy(xpath = "//img[@alt='Breathe-Easy Tank']")
    WebElement breatheEasyTank_img;
    @FindBy(xpath = "//img[@alt='Argus All-Weather Tank']")
    WebElement ArgusWeatherTank_img;
    @FindBy(xpath = "//img[@alt='Hero Hoodie']")
    WebElement heroHoodie_img ;
    @FindBy(xpath = "//img[@alt='Fusion Backpack']")
    WebElement fusionBackpack_img;
    @FindBy(xpath = "//img[@alt='Push It Messenger Bag']")
    WebElement pushItMessengerBag_img;

    //  Actions
    public String getHomePageHeader() {
        return homePage_header.getText();
    }
    public void clickArrowIcon() {
        arrow_icon.click();
    }
    public void clickMyAccount() {
        myAccount_label.click();
    }
    public void clickMyWishList() {
        myWishList_label.click();
    }
    public void clickSignOut() {
        signOut_label.click();
    }
    public void clickShopNewYoga() {
        shopNewYoga_link.click();
    }
    public void clickRadiantTee() {
        radiantTee_img.click();
    }
    public void clickBreatheEasyTank() {
        breatheEasyTank_img.click();
    }
    public void clickArgusWeatherTank() {
        ArgusWeatherTank_img.click();
    }
    public void clickHeroHoodie() {
        heroHoodie_img.click();
    }
    public void clickFusionBackpack() {
        fusionBackpack_img.click();
    }
    public void clickPushItMessengerBag() {
        pushItMessengerBag_img.click();
    }
}
