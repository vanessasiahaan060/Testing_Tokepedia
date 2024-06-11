package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class pengirimanTest {
    WebDriver driver;

    @Given("^I am on the Tokopedia website for pengiriman$")
    public void i_am_on_the_Tokopedia_website_for_pengiriman() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @When("^I search for a skincare product on the website$")
    public void I_search_for_a_skincare_product_on_the_website() throws Throwable {
        
        throw new PendingException();
    }

    @When("^I click on the delivery option$")
    public void I_click_on_the_delivery_option() throws Throwable {
        
        throw new PendingException();
    }

    @Then("^I should be able to select the delivery option$")
    public void I_should_be_able_to_select_the_delivery_option() throws Throwable {
        
        throw new PendingException();
    }
}
