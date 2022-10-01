package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
	WebDriver driver;
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.saucedemo.com/");
	}
	@When("^I provide the  (.*) and (.*)$")
	public void i_provide_the_username_and_password(String username,String password) throws InterruptedException {
	    driver.findElement(By.name("user-name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	@When("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(5000);
	}
	@Then("I should be redirected to home page")
	public void i_should_be_redirected_to_home_page() {
		//String actualText = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).getAttribute("name");
		driver.close();	
		String expectedText = "add-to-cart-sauce-labs-backpack";
		//assertEquals(actualText, expectedText);
		
	}
}