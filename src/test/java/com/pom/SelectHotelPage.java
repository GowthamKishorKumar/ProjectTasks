package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.maven.MavenTasks.LibGlobal;

public class SelectHotelPage extends LibGlobal {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);}	
	@FindBy(id="radiobutton_0")
	private WebElement opt;
	@FindBy(id="continue")
	private WebElement btnContinue;
	public WebElement getOpt() {
		return opt;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	
	public void selectHotel() {
		click(getOpt());
		click(getBtnContinue());

	}
}
