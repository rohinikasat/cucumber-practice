package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	WebDriver driver;
	
	@Given("I am on the google search page")
	public void i_am_on_the_google_search_page() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 
	}
	@When("I enter any search keyword in search textbox")
	public void i_enter_any_search_keyword_in_search_textbox() {
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
	    .sendKeys("java books");
		
	}
	@When("I click on search button")
	public void i_click_on_search_button() {
	   driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"))
	   .click();
	}
	@Then("I should be redirected to search results page")
	public void i_should_be_redirected_to_search_results_page() {
		if(driver.findElement(By.id("result-stats")).getText().contains("results")) {
			System.out.println("Test passed");
		} else System.out.println("Test failed");
		
		driver.close();
		driver.quit();
	    
	}




}
