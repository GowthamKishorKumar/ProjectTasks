package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {

	WebDriver driver;

	@Given("Im on the AdactinHotel App page")
	public void im_on_the_AdactinHotel_App_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@When("I should  login with {string} , {string}")
	public void i_should_login_with(String name, String pass) {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(name);

		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(pass);

		WebElement btnLog = driver.findElement(By.id("login"));
		btnLog.click();
	}

	@When("I should search, select and Book hotels with {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}and{string}")
	public void i_should_search_select_and_Book_hotels_with_and(String location, String hotel, String roomtype,
			String roomnum, String in, String out, String adultroom, String childroom, String fN, String lN, String add,
			String cardNo, String cardType, String expMonth, String expYear, String cVV) {

		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue(location);
		WebElement hot = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hot);
		s1.selectByValue(hotel);
		WebElement type = driver.findElement(By.id("room_type"));
		Select s2 = new Select(type);
		s2.selectByValue(roomtype);
		WebElement num = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(num);
		s3.selectByValue(roomnum);
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys(in);
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys(out);
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s6 = new Select(adultRoom);
		s6.selectByValue(adultroom);
		WebElement childRoom = driver.findElement(By.id("child_room"));
		Select s7 = new Select(childRoom);
		s7.selectByValue(childroom);
		WebElement searchbtn = driver.findElement(By.id("Submit"));
		searchbtn.click();

		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();

		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(fN);
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(lN);
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(add);
		WebElement ccNumber = driver.findElement(By.id("cc_num"));
		ccNumber.sendKeys(cardNo);
		WebElement ccTyp = driver.findElement(By.id("cc_type"));
		Select s8 = new Select(ccTyp);
		s8.selectByValue(cardType);
		WebElement expMn = driver.findElement(By.id("cc_exp_month"));
		Select s9 = new Select(expMn);
		s9.selectByValue(expMonth);
		WebElement expYr = driver.findElement(By.id("cc_exp_year"));
		Select s10 = new Select(expYr);
		s10.selectByValue(expYear);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys(cVV);
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}

	@Then("I should print the order id")
	public void i_should_print_the_order_id() {
		WebElement ordId = driver.findElement(By.id("order_no"));
		String text = ordId.getAttribute("value");
		System.out.println(text);

	}

}
