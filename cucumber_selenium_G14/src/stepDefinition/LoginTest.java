package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

    @Given("^I open Tokopedia website$")
    public void I_open_Tokopedia_website() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tokopedia.com/");
	}
	
    @When("^I enter valid email$")
    public void I_enter_valid_email() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"vm__white-header-dweb\"]/section/header/div[3]/div/div/div[2]/div/a[2]"))
            .click();
        driver.findElement(By.xpath("//*[@id=\"LoginID\"]")).sendKeys("vanessasiahaan4@gmail.com");
    }
	
    @Then("^I click the login button$")
    public void I_click_the_login_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"submit_button\"]")).click();
    }
}
