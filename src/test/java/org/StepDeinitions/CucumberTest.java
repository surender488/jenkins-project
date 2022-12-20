package org.StepDeinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CucumberTest {
	static WebDriver driver;
	
	@Given("user is on he login page")
	public void user_is_on_he_login_page() {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   }

	@When("The user fill the {string} and {string}")
	public void the_user_fill_the_and(String user, String pass)  throws InterruptedException {
		WebDriverWait w=new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.name("username"));
	username.sendKeys(user);
	
	
	String attribute1 = username.getAttribute(pass);
	System.out.println(attribute1);
		
	WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(pass);
		String attribute = password.getAttribute(pass);
		System.out.println(attribute);
		
		
		
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		WebDriverWait w=new WebDriverWait(driver, 20);
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	   btnclick.click();
	   driver.quit();
	}

	@Then("the user should be nevigated to home page")
	public void the_user_should_be_nevigated_to_home_page() throws InterruptedException {
		WebDriverWait w=new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		WebElement check = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
		
	    boolean displayed = check.isDisplayed();
	    Assert.assertTrue(displayed);
	
	    driver.quit();
	}

}
