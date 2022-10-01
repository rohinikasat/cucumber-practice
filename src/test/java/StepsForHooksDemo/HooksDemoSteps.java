package StepsForHooksDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksDemoSteps {

	WebDriver driver;
	
	@Before
	public void browserSetup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		 driver.get("https://www.saucedemo.com/");
	}

	@When("^user provides the  (.*) and (.*)$")
	public void user_provides_the_username_and_password(String username,String password) {
		driver.findElement(By.name("user-name")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.name("login-button")).click();
	}

	@Then("user is logged in")
	public void user_is_logged_in() {
	    
	}
}
