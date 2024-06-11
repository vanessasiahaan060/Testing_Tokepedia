package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchTest {
    WebDriver driver;

    @Given("^I am on the Tokopedia website for search$")
    public void i_am_on_the_tokopedia_website_for_search() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @When("^I search for a product$")
    public void i_search_for_a_product() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"v-omnisearch__input\"]"))
                .sendKeys("skincare");
        driver.findElement(By.xpath("//*[@id=\"v-omnisearch\"]/button"))
                .click();
    }
}
