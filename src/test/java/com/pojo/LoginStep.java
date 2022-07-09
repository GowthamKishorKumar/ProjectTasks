package com.pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStep {
	WebDriver driver;
	@Given("Im on the AdactinHotel App page")
	public void im_on_the_AdactinHotel_App_page() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@When("I should enter Username and Password")
	public void i_should_enter_Username_and_Password() {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("GowthamKk");
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("Kishore1");
	}

	@When("I should click the login button")
	public void i_should_click_the_login_button() {
		WebElement btnLog = driver.findElement(By.id("login"));
		btnLog.click();
	}

	@Then("I should verify the Success message")
	public void d() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Search Hotel"));
		driver.quit();
	}




}
