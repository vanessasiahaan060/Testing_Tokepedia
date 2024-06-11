package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuTest {
    WebDriver driver;

    @Given("^I am on the Tokopedia website for semua menu$")
    public void i_am_on_the_tokopedia_website_for_semua_menu() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @When("^I click on the semua menu icon$")
    public void i_click_on_the_semua_menu_icon() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"homepage-home-section-app\"]/section[1]/div/div/div/div/div/div/div[9]/div/div[1]/div")).click();
    }

    @When("^I click on the pulsa prabayar icon$")
    public void i_click_on_the_pulsa_prabayar_icon() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"homepage-home-section-app\"]/section[1]/div/div/div[2]/div[1]/div[1]/div[2]/div[2]")).click();
    }

    @Then("^I should be redirected to the pulsa prabayar page$")
    public void i_should_be_redirected_to_the_pulsa_prabayar_page() throws Throwable {
        // Add verification code to ensure that the user is redirected to the pulsa prabayar page
        boolean redirectedToPulsaPrabayarPage = driver.getCurrentUrl().contains("pulsa-prabayar");
        if (redirectedToPulsaPrabayarPage) {
            System.out.println("Successfully redirected to the pulsa prabayar page.");
        } else {
            System.out.println("Failed to redirect to the pulsa prabayar page.");
        }
    }
}
