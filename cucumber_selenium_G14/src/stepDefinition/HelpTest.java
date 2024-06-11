package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelpTest {
    WebDriver driver;

    @Given("^I am on the Tokopedia website for buka bantuan$")
    public void i_am_on_the_tokopedia_website_for_buka_bantuan() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @When("^I click on Buka Bantuan$")
    public void i_click_on_buka_bantuan() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/p[1]")).click();
    }

    @When("^I search for a question$")
    public void i_search_for_a_question() throws Throwable {
        driver.findElement(By.id("keywords-field")).sendKeys("Membatalkan Pesan");
        driver.findElement(By.xpath("//*[@id=\"app-container\"]/section/div[1]/div/div[1]/div[1]/button")).click();
    }

    @Then("^I see the search results$")
    public void i_see_the_search_results() throws Throwable {
        // Add assertion to verify search results
    }
}
