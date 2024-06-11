package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class kategoritest {
    WebDriver driver;

    @Given("^I am on the Tokopedia website for kategori$")
    public void i_am_on_the_tokopedia_website_for_kategori() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @When("^I select a category$")
    public void i_select_a_category() throws Throwable {
        // Add your test steps here
    }

    @Then("^I see the category page$")
    public void i_see_the_category_page() throws Throwable {
        // Add your test steps here
    }
}
