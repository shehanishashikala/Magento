package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountSteps {

    WebDriver driver;

    @Before
    public void setUp() {
        // Setup WebDriver and maximize window
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
//
//    @Given("browser is in open status")
//    public void browser_is_in_open_status() {
//    }
//
//    @Given("user is on the page")
//    public void user_is_on_the_page() throws InterruptedException {
//        driver.navigate().to("https://magento.softwaretestingboard.com/");
//        Thread.sleep(2000);
//    }
//
//    @Given("clicks Create Account")
//    public void clicks_create_account() {
//        driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
//    }
//
//
//    @Given("user is on Create New Customer Account page")
//    public void user_is_on_create_new_customer_account_page() throws InterruptedException {
//        driver.findElement(By.xpath("//span[@class='base']")).isDisplayed();
//        Thread.sleep(5000);
//    }
//
//    @Given("user enter {string}, {string}, {string}, {string}, and {string}")
////    @Given("user enters (.*), (.*), (.*), (.*), and (.*)")
//    public void user_enter_and(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) throws InterruptedException {
//        driver.findElement(By.id("firstname")).sendKeys(FirstName);
//        driver.findElement(By.id("lastname")).sendKeys(LastName);
//        driver.findElement(By.id("email_address")).sendKeys(Email);
//        driver.findElement(By.id("password")).sendKeys(Password);
//        driver.findElement(By.id("password-confirmation")).sendKeys(ConfirmPassword);
//        Thread.sleep(2000);
//    }
//
//    @When("clicks Create an Account button")
//    public void clicks_create_an_account_button() {
//        driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
//    }
//
//    @Then("user navigates to the Home page")
//    public void user_navigates_to_the_home_page() throws InterruptedException {
//        Thread.sleep(2000);
//    }
//
//
//    @And("user enters {},{},{},{} and <Confirm Password>")
//    public void userEntersAndConfirmPassword(String arg0, String arg1, String arg2, String arg3) {
//    }

    @After
    public void windowQuit() {
        driver.quit();
    }

}
