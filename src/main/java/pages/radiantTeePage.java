package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class radiantTeePage {

    WebDriver driver;

    public radiantTeePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    Elements

    @FindBy(xpath = "//span[@class='base']")
    WebElement radiantTeePageHeader;
    @FindBy(xpath = "//span[contains(text(),'$22.00')]")
    WebElement price_r;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-166']")
    WebElement size_xs;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-167']")
    WebElement size_s;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
    WebElement size_m;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
    WebElement size_l;
    @FindBy(xpath = "//div[@id='option-label-size-143-item-170']")
    WebElement size_xl;

    @FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
    WebElement blue_color;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-56']")
    WebElement orange_color;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-57']")
    WebElement pink_color;

    @FindBy(id = "qty")
    WebElement qty_enter;
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCart_button;

    @FindBy(xpath = "//a[@id='tab-label-description-title']")
    WebElement details_tab;
    @FindBy(xpath = "//a[@id='tab-label-additional-title']")
    WebElement moreInfo_tab;
    @FindBy(xpath = "//a[@id='tab-label-reviews-title']")
    WebElement review_tab;

    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement cart_icon;
    @FindBy(xpath = "//strong[@class='subtitle empty']")
    WebElement noItems_cart;
    @FindBy(xpath = "//span[@class='counter-number']")
    WebElement cart_count;

//    Actions
    public String getRadiantTeePageHeader() {
        return radiantTeePageHeader.getText();
    }
    public void getPriceR() {
        String PriceR = price_r.getText();
    }
    public void clickSizeS() {
        size_xs.click();
    }
    public void clickSizeXs() {
        size_xs.click();
    }
    public void clickSizeSX() {
        size_s.click();
    }
    public void clickSizeM() {
        size_m.click();
    }
    public void clickSizeL() {
        size_l.click();
    }
    public void clickSizeXL() {
        size_xl.click();
    }
    public void clickBlueColor() {
        blue_color.click();
    }
    public void clickOrangeColor() {
        orange_color.click();
    }
    public void clickPinkColor() {
        pink_color.click();
    }
    public void EnterQty() {
        qty_enter.sendKeys("1");
    }
    public void clickAddToCartButton() {
        addToCart_button.click();
    }
    public void clickDetailsTab() {
        details_tab.click();
    }
    public void clickMoreInfoTab() {
        moreInfo_tab.click();
    }
    public void clickReviewTab() {
        review_tab.click();
    }
    public void clickCartIcon() {
        cart_icon.click();
    }
    public void clickNoItemsCart() {
        noItems_cart.click();
    }
    public void getCartCount() {
        String CartCount = cart_count.getText();
    }

    public void select_OrangeColorSizeM_T(){
        orange_color.click();
        size_s.click();
    }

}
