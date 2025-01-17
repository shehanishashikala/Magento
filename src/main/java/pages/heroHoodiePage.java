package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class heroHoodiePage {

    WebDriver driver;
    radiantTeePage radiantTee;

    public heroHoodiePage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='base']")
    WebElement heroHoodiePageHeader;
    @FindBy(xpath = "//span[contains(text(),'$54.00')]")
    WebElement price_h;

//    By size_xs = By.xpath("//div[@id='option-label-size-143-item-166']");
//    By size_s = By.xpath("//div[@id='option-label-size-143-item-167']");
//    By size_m = By.xpath("//div[@id='option-label-size-143-item-168']");
//    By size_l = By.xpath("//div[@id='option-label-size-143-item-169']");
//    By size_xl = By.xpath("//div[@id='option-label-size-143-item-170']");

    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement black_color;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-52']")
    WebElement gray_color;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-53']")
    WebElement green_color;

//    By qty_enter = By.id("qty");
//    By addToCart_button = By.xpath("//span[normalize-space()='Add to Cart']");
//
//    By details_tab = By.xpath("//a[@id='tab-label-description-title']");
//    By moreInfo_tab = By.xpath("//a[@id='tab-label-additional-title']");
//    By review_tab = By.xpath("//a[@id='tab-label-reviews-title']");
//
//
//    By cart_icon = By.xpath("//a[@class='action showcart']");
//    By noItems_cart = By.xpath("//strong[@class='subtitle empty']");
//    By cart_count = By.xpath("//span[@class='counter-number']");

    public String getHeroHoodiePageHeader() {
        return heroHoodiePageHeader.getText();
    }
    public void getPriceH(){
        String priceH = price_h.getText();
    }
    public void selectBlackColor(){
        black_color.click();
    }
    public void selectGrayColor(){
        gray_color.click();
    }
    public void selectGreenColor(){
        green_color.click();
    }
}
