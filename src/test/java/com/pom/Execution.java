package com.pom;

import org.junit.*;
import org.task.maven.MavenTasks.LibGlobal;

public class Execution extends LibGlobal {
	@BeforeClass
	public static void loginClass() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/");
		maximize();}
		@AfterClass
		public static void exitClass() {
			closeAll();}


	@Test
	public void searchHotels() throws Exception {
		LoginPage log = new LoginPage();
		String name = fileData("sheet1", 0, 0);
		String pass = fileData("sheet1", 1, 0);
		log.login(name, pass);

		SearchHotelPage search = new SearchHotelPage();
		search.searchHotel(fileData("sheet1", 2, 0),fileData("sheet1", 3, 0),fileData("sheet1", 4, 0),"1","15/12/2022","16/12/2022","1","1");

		SelectHotelPage select = new SelectHotelPage();
		select.selectHotel();

		BookHotelPage book = new BookHotelPage();
		book.bookHotel("Gowtham", "KK", "chennai", "2134567890125346", "VISA", "12", "2022", "123");	 
		
		BookingConformationPage confirm = new BookingConformationPage();
		confirm.bookConform();

		CancelBooking cancel = new CancelBooking();
		cancel.cancelHotel();


	}

}
