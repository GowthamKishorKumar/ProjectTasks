package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.maven.MavenTasks.LibGlobal;

public class SearchHotelPage extends LibGlobal{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);}
	
	@FindBy(id="location")
	private WebElement optLoc;
	@FindBy(id="hotels")
	private WebElement optHot;
	@FindBy(id="room_type")
	private WebElement optType;
	@FindBy(id="room_nos")
	private WebElement optNum;
	@FindBy(id="datepick_in")
	private WebElement optIn;
	@FindBy(id="datepick_out")
	private WebElement optOut;
	@FindBy(id="adult_room")
	private WebElement optAdult;
	@FindBy(id="child_room")
	private WebElement optChild;
	@FindBy(id="Submit")
	private WebElement btnsearch;
	public WebElement getOptLoc() {
		return optLoc;
	}
	public WebElement getOptHot() {
		return optHot;
	}
	public WebElement getOptType() {
		return optType;
	}
	public WebElement getOptNum() {
		return optNum;
	}
	public WebElement getOptIn() {
		return optIn;
	}
	public WebElement getOptOut() {
		return optOut;
	}
	public WebElement getOptAdult() {
		return optAdult;
	}
	public WebElement getOptChild() {
		return optChild;
	}
	public WebElement getBtnsearch() {
		return btnsearch;
	}
	public void searchHotel(String location,String hotel, String type, String number,String inDate, String outDate, String adult,String children) {
		
		selectOption(getOptLoc(), location);
		selectOption(getOptHot(), hotel);
		selectOption(getOptType(), type);
		selectOption(getOptNum(), number);
		insertValue(getOptIn(), inDate);
		insertValue(getOptOut(), outDate);
		selectOption(getOptAdult(), adult);
		selectOption(getOptChild(), children);
		click(getBtnsearch());
		

	}

}
