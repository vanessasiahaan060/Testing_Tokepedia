package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class promotest {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.tokopedia.com/");
    }

    public void tearDown() {
        driver.quit();
    }

    @When("^I select a promo$")
    public void i_select_a_promo() throws Throwable {
        // Memilih promo, misalnya dengan mengklik elemen promo
        WebElement promoElement = driver.findElement(By.xpath("xpath_promo_element"));
        promoElement.click();
    }

    @Then("^I see the promo page$")
    public void i_see_the_promo_page() throws Throwable {
        // Memverifikasi bahwa halaman promo muncul
        WebElement promoPageElement = driver.findElement(By.xpath("xpath_promo_page"));
        Assert.assertTrue(promoPageElement.isDisplayed());
    }
}
