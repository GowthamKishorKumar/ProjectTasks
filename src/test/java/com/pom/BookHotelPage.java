package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.task.maven.MavenTasks.LibGlobal;

public class BookHotelPage extends LibGlobal{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);}
	
	@FindBy(id="first_name")
	private WebElement txtFn;
	@FindBy(id="last_name")
	private WebElement txtLn;
	@FindBy(id="address")
	private WebElement txtAdd;
	@FindBy(id="cc_num")
	private WebElement txtNum;
	@FindBy(id="cc_type")
	private WebElement opttype;
	@FindBy(id="cc_exp_month")
	private WebElement optMont;
	@FindBy(id="cc_exp_year")
	private WebElement optYr;
	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	@FindBy(id="book_now")
	private WebElement btnBook;
	public WebElement getTxtFn() {
		return txtFn;
	}
	public WebElement getTxtLn() {
		return txtLn;
	}
	public WebElement getTxtAdd() {
		return txtAdd;
	}
	public WebElement getTxtNum() {
		return txtNum;
	}
	public WebElement getOpttype() {
		return opttype;
	}
	public WebElement getOptMont() {
		return optMont;
	}
	public WebElement getOptYr() {
		return optYr;
	}
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	public WebElement getBtnBook() {
		return btnBook;
	}
	public void bookHotel(String firstName,String lasttName,String Add,String ccNum,String ccType ,String expMon ,String expYr,String cvv ) {
		insertValue(getTxtFn(), firstName);
		insertValue(getTxtLn(), lasttName);
		insertValue(getTxtAdd(), Add);
		insertValue(getTxtNum(), ccNum);
		selectOption(getOpttype(), ccType);
		selectOption(getOptMont(), expMon);
		selectOption(getOptYr(), expYr);
		insertValue(getTxtcvv(), cvv);
		click(getBtnBook());
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
