package stepDefinition_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_task {
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		System.out.println("Opened Browser Window and navigated to HotelApp");
	}
	@Before("@SmokeTest")
	public void beforeSmokeTest()
	{
		System.out.println("Tagged Hook");
	}
	@Given("I am on HotelApp login page")
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Inside Given Method");
		
	}
 
	@When("I want to give the username as {string}")
	public void i_want_to_give_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("username")).sendKeys(string);
	}
 
	@When("I want to give the password as {string}")
	public void i_want_to_give_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}
 
	@When("I click on login button")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("login")).click();
	}
	
	@Then("It should redirect to the hotel booking page")
	public void it_should_redirect_to_the_hotel_booking_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
 
	@Given("I am on the Search Hotel Page")
	public void i_am_on_the_search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
 
	@When("I want to give the location as {string}")
	public void i_want_to_give_the_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement location = driver.findElement(By.id("location"));
		Select loc = new Select(location);
		loc.selectByVisibleText(string);
	}
 
	@Then("I want to click on search button")
	public void i_want_to_click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("Submit")).click();
	}

}
