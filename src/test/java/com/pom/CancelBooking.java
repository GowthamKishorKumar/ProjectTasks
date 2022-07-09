package com.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.maven.MavenTasks.LibGlobal;

public class CancelBooking extends LibGlobal {
	public CancelBooking() {
		PageFactory.initElements(driver, this);}
	
	@FindBy(id="order_id_text")
	private WebElement txtSearch;

	@FindBy(xpath="//input[@name='check_all']")
	private WebElement radiobtn;

	@FindBy(xpath="//input[@value='Cancel Selected']")
	private WebElement btnCancel;

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}
	public void cancelHotel() {
//	  insertValue(getTxtSearch(), searchnum);
	  click(getRadiobtn());
	  click(getBtnCancel());
	  Alert al = driver.switchTo().alert();
	  al.accept();
	  

	}
}
