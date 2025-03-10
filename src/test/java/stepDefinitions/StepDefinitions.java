package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobjects.LoginPage;
import pageobjects.WebTablePage;

public class StepDefinitions {

public WebDriver driver;
public LoginPage lp;
public WebTablePage wp;
    @Given("User Launch the Chrome browser")
    public void user_launch_the_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Initialize driver with options
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
        wp = new WebTablePage(driver);
    }
    @When("User opens URL {string}")
    public void user_opens_url(String url) {
      driver.get(url);
    }
    @Then("User enters the required fields")
    public void user_enters_the_required_fields() throws InterruptedException {
    lp.setUp();
    lp.selectDropdown();
    lp.selectButtons();
    }
    @And("User performs scrolling the Webtable action")
    public void user_performs_scrolling_the_webtable_action() throws InterruptedException {
     wp.setTablepage();
    }
    @Then("User counts the total amount in the Webtable")
    public void user_counts_the_total_amount_in_the_webtable() {
    wp.countPage();
    }
    @And("close the browser")
    public void close_the_browser() {
     driver.quit();
    }










}
