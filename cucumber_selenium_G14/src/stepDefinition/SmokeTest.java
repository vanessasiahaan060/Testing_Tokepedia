package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;

	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cis.del.ac.id/user/login");
	}
	
	@When("^I enter valid username and valid password$")
	public void I_enter_valid_username_and_valid_password() throws Throwable {
		driver.findElement(By.id("loginform-username")).sendKeys("if322060");
		driver.findElement(By.id("loginform-password")).sendKeys("....");
	}
	
	@Then("^I can login succesfully$")
	public void I_can_login_succesfully() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div[2]/button")).click();
	}
}