package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.signInPage;
import pages.signInPage;

public class LoginNavigatePages {

    WebDriver driver;
    signInPage signIn;

    @Before
    public void setUp() {
        // Setup WebDriver and maximize window
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("the browser is open")
    public void the_browser_is_open() {
    }

    @Given("I navigate to the Magento page")
    public void i_navigate_to_the_magento_page() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(5000);
    }

    @When("clicks Sign In label")
    public void clicks_sign_in_label() {
        driver.findElement(By.cssSelector("div[class='panel header'] li[data-label='or'] a")).click();
    }

    @Given("user is on Sign In page")
    public void user_is_on_sign_in_page() {

    }

    @When("I enter valid credential of {string} and {string}")
    public void i_enter_valid_credential_of_and(String Email, String Password) {

        signIn = new signInPage(driver);
        signIn.enterEmail(Email);
        signIn.enterPassword(Password);

//        driver.findElement(By.id("email")).sendKeys(Email);
//        driver.findElement(By.id("pass")).sendKeys(Password);
    }

    @When("I click the Sign In button")
    public void i_click_the_sign_in_button() {
       driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
    }

    @When("I navigate to Home Page")
    public void i_navigate_to_home_page() {
    }

    @Then("I should see the Home Page header")
    public void i_should_see_the_home_page_header() throws InterruptedException {
        WebElement accPageHeader = driver.findElement(By.cssSelector(".base"));
        System.out.println(accPageHeader.getText());
        Thread.sleep(2000);
    }

//    @Then("I should see the Home page header")
//    public void i_should_see_the_home_page_header() throws InterruptedException {
//        WebElement accPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
//        System.out.println(accPageHeader.getText());
//        Thread.sleep(2000);
//    }

    @Then("I click the above arrow icon")
    public void i_click_the_above_arrow_icon() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
    }

    @When("click My Account button there")
    public void click_my_account_button_there() throws InterruptedException {
        Thread.sleep(4000);
       driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='My Account']")).click();
    }

    @When("I navigate to My Account page")
    public void i_navigate_to_my_account_page() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Then("I should see the My Account header")
    public void i_should_see_the_my_account_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement accPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(accPageHeader.getText());
    }

    @Then("I click My Orders button")
    public void i_click_my_orders_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='My Orders']")).click();
    }

    @When("I navigate to the My Orders page")
    public void i_navigate_to_the_my_orders_page() {

    }

    @Then("I should see the My Orders header")
    public void i_should_see_the_my_orders_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement myOrdersPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(myOrdersPageHeader.getText());
    }

    @Then("I click My Downloadable Products button")
    public void i_click_my_downloadable_products_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='My Downloadable Products']")).click();

    }
    @When("I navigate to the My Downloadable Products page")
    public void i_navigate_to_the_my_downloadable_products_page() {

    }
    @Then("I should see the My Downloadable Products header")
    public void i_should_see_the_my_downloadable_products_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement downloadProductsPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(downloadProductsPageHeader.getText());
    }

    @Then("I click My Wish List button")
    public void i_click_my_wish_list_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='nav item']//a[normalize-space()='My Wish List']")).click();
    }

    @When("I navigate to the My Wish List page")
    public void i_navigate_to_the_my_wish_list_page() {
    }

    @Then("I should see the My Wish List header")
    public void i_should_see_the_my_wish_list_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement wishListPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(wishListPageHeader.getText());
    }

    @Then("I click Address Book button")
    public void i_click_address_book_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Address Book']")).click();
    }

    @When("I navigate to the Address Book page")
    public void i_navigate_to_the_address_book_page() {
    }

    @Then("I should see the Add New Address header")
    public void i_should_see_the_add_new_address_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement addressBookPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(addressBookPageHeader.getText());
    }

    @Then("I click Account Information button")
    public void i_click_account_information_button() {
        driver.findElement(By.xpath("//a[normalize-space()='Account Information']")).click();
    }

    @When("I navigate to the Account Information page")
    public void i_navigate_to_the_account_information_page() {
    }

    @Then("I should see the Edit Account Information header")
    public void i_should_see_the_edit_account_information_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement accInfoPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(accInfoPageHeader.getText());
    }

    @Then("I click Stored Payment Methods button")
    public void i_click_stored_payment_methods_button() {
        driver.findElement(By.xpath("//a[normalize-space()='Stored Payment Methods']")).click();

    }

    @When("I navigate to the Stored Payment Methods page")
    public void i_navigate_to_the_stored_payment_methods_page() {
    }

    @Then("I should see the Stored Payment Methods header")
    public void i_should_see_the_stored_payment_methods_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement paymentMethodPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(paymentMethodPageHeader.getText());
    }

    @When("I click My Product Reviews button")
    public void i_click_my_products_reviews_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='My Product Reviews']")).click();
    }

    @When("I navigate to the My Product Reviews page")
    public void i_navigate_to_the_my_product_reviews_page() {
    }

    @Then("I should see the My Product Reviews header")
    public void i_should_see_the_my_product_reviews_header() throws InterruptedException {
        Thread.sleep(2000);
        WebElement productReviewPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(productReviewPageHeader.getText());
    }

    @Given("I click the arrow icon again")
    public void i_click_the_arrow_icon_again() {
        driver.findElement(By.cssSelector("div[class='panel header'] button[type='button']")).click();
    }

    @When("I click the Sign Out button")
    public void i_click_the_sign_out_button() {
        driver.findElement(By.cssSelector("div[aria-hidden='false'] li[data-label='or'] a")).click();
    }


    @Then("I should be redirected to the Magento homepage")
    public void i_should_be_redirected_to_the_magento_homepage() {
    }

    @Then("I should see the message You are signed out")
    public void i_should_see_the_message_you_are_signed_out() throws InterruptedException {
        Thread.sleep(2000);
        WebElement accPageHeader = driver.findElement(By.xpath("//span[@class='base']"));
        System.out.println(accPageHeader.getText());
    }


    @After
    public void driverDown() {
        driver.quit();
    }
}
