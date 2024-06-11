package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class hapusSearchTest {
    WebDriver driver;
    
    @Given("^I am on the Tokopedia website for penghapusanpencarian$")
    public void I_am_on_the_Tokopedia_website_for_penghapusanpencarian() throws Throwable {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tokopedia.com/");
    }

    @When("^I clear the search box$")
    public void i_clear_the_search_box() throws Throwable {
     
        driver.findElement(By.xpath("//*[@id=\"v-omnisearch__input\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"v-omnisearch\"]/div/div/div[1]/div[1]/span")).click();
    }

    @Then("^I should see the search box cleared$")
    public void i_should_see_the_search_box_cleared() throws Throwable {

        String searchBoxText = driver.findElement(By.xpath("//*[@id=\"v-omnisearch__input\"]")).getAttribute("value");
        assert(searchBoxText.isEmpty());
        
    }
}
