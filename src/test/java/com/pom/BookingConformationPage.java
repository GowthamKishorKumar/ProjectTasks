package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.maven.MavenTasks.LibGlobal;

public class BookingConformationPage extends LibGlobal {
	public BookingConformationPage() {
		PageFactory.initElements(driver, this);}
	
	@FindBy(xpath="//a[@href='BookedItinerary.php']")
	private WebElement btnItinerary;

	public WebElement getBtnItinerary() {
		return btnItinerary;
	}
	public void bookConform() {
		click(getBtnItinerary());

	}
}
