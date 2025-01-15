package StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import pages.signInPage;

public class LoginNavigatePages {

    WebDriver driver;
    signInPage signIn;
    homePage home;
    myAccountPage myAccount;
    myOrdersPage myOrders;
    myDownloadableProductsPage myDownloadableProducts;
    myWishListPage myWishList;
    addressBookPage addressBook;
    editAccountPage editAccount;
    storedPaymentPage storedPayment;
    productReviewsPage productReviews;

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
    public void i_enter_valid_credential_of_and(String Email, String Password) throws InterruptedException {
        signIn = new signInPage(driver);
        Thread.sleep(2000);
        signIn.enterEmail(Email);
        signIn.enterPassword(Password);
    }

    @When("I click the Sign In button")
    public void i_click_the_sign_in_button() {
        signIn.clickSubmit();
    }

    @When("I navigate to Home Page")
    public void i_navigate_to_home_page() {
    }

    @Then("I should see the Home Page header")
    public void i_should_see_the_home_page_header() throws InterruptedException {

        home = new homePage(driver);
        String HeaderText = home.getHomePageHeader();
        Thread.sleep(2000);
        System.out.println("Home Page Header: " + HeaderText);
    }

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

        myAccount = new myAccountPage(driver);
        String HeadermyAcc = myAccount.getMyAccountPageHeader();
        Thread.sleep(2000);
        System.out.println("Account Page Header: " + HeadermyAcc);

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
        myOrders = new myOrdersPage(driver);
        String myOrders_Header = myOrders.getMyOrders_pageHeader();
        Thread.sleep(2000);
        System.out.println("My Orders Header: " + myOrders_Header);

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
        myDownloadableProducts = new myDownloadableProductsPage(driver);
        String myDownloadableProducts_Header = myDownloadableProducts.getMyAccount_pageHeader();
        Thread.sleep(2000);
        System.out.println("My Downloadable Products Header: " + myDownloadableProducts_Header);
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
        myWishList = new myWishListPage(driver);
        String myWishList_Header = myWishList.getWishListPageHeader();
        Thread.sleep(2000);
        System.out.println("My Wish List Header: " + myWishList_Header);
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
        addressBook = new addressBookPage(driver);
        String addressBook_PageHeader = addressBook.getAddressBookPageHeader();
        Thread.sleep(2000);
        System.out.println("Address Book Page Header: " + addressBook_PageHeader);

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
       editAccount = new editAccountPage(driver);
       String editAccount_Page = editAccount.geteditAccountPageHeader();
       Thread.sleep(2000);
       System.out.println("Edit Account Page: " + editAccount_Page);
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
        storedPayment = new storedPaymentPage(driver);
        String storedPayment_PageHeader = storedPayment.getStoredPaymentPageHeader();
        Thread.sleep(2000);
        System.out.println("Stored Payment Page Header: " + storedPayment_PageHeader);
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
       productReviews = new productReviewsPage(driver);
       String productReview_PageHeader = productReviews.getProductReviewsPageHeader();
       Thread.sleep(2000);
       System.out.println("Product Review Page Header: " + productReview_PageHeader);
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
