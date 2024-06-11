package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class filterTest {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("^I am on the Tokopedia website for filter$")
    public void i_am_on_the_tokopedia_websit_for_filter() throws Throwable {
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @When("^I search for skincare products$")
    public void i_search_for_skincare_products() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"v-omnisearch__input\"]"))
            .sendKeys("skincare");
        driver.findElement(By.xpath("//*[@id=\"v-omnisearch\"]/button"))
            .click();
    }

    @Then("^I apply the filter for product type$")
    public void i_apply_the_filter_for_product_type() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"product-explorer-container\"]/div/div[1]/div[1]/div/div[2]/div[1]/div/label[1]/input"))
            .click();
    }
}