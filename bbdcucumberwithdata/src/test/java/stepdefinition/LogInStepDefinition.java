package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInStepDefinition {
	WebDriver driver;
	
	@Given("open web browser")
	public void open_web_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}

	@Then("enter url {string}")
	public void enter_url(String url) {
	    driver.get(url);
	}

	@Then("enter valid username {string}")
	public void enter_valid_username(String string) {
		WebElement username = driver.findElement(By.id("txtUsername"));
	    username.sendKeys(string);
	}

	@Then("enter valid password  {string}")
	public void enter_valid_password(String string) {
	    WebElement password = driver.findElement(By.name("txtPassword"));
	    password.sendKeys(string);
	}

	@And("click login")
	public void click_login() {
		WebElement login = driver.findElement(By.name("Submit"));
	    login.click();
	}


}
