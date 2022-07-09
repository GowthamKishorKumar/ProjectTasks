package org.task.maven.MavenTasks;

import org.junit.*;
import org.openqa.selenium.WebElement;

public class adactinHotel extends LibGlobal {
	@BeforeClass
	public static void login() {
		getDriver();
		loadUrl("https://adactinhotelapp.com/index.php");
		maximize();}

//	@AfterClass
//	public static void close() {
//		closeAll();}

	@Before
	public void timeForStart() {
		long time = System.currentTimeMillis();
		System.out.println(time);}

	@After
	public void timeForEndS() {
		long time = System.currentTimeMillis();
		System.out.println(time);}


	@Test
	public void insertData() throws Throwable {
		WebElement txtUser = findElementBYId("username");
		String name = fileData("sheet1", 0, 0);
		insertValue(txtUser, name);

		WebElement txtPass = findElementBYId("password");
		String pass = fileData("sheet1", 1, 0);
		insertValue(txtPass, pass);

		WebElement btnLogin = findElementBYId("login");
		click(btnLogin);


		WebElement location = findElementBYId("location");
		selectOption(location, "Sydney");

		WebElement btnsubmit = findElementBYId("Submit");
		click(btnsubmit);

		WebElement login = findElementBYClass("login_title");
		String log = getText(login);
		System.out.println(log);

		WebElement button = findElementBYId("radiobutton_2");
		click(button);

		WebElement cont = findElementBYId("continue");
		click(cont);

		WebElement titleHotel = findElementBYXpath("(//td[@class='login_title'])[2]");
		String hotel = getText(titleHotel);
		System.out.println(hotel);

		WebElement txtFname = findElementBYId("first_name");
		insertValue(txtFname, "GKK");

		WebElement txtLname = findElementBYId("last_name");
		insertValue(txtLname, "KK");

		WebElement txtAdd = findElementBYId("address");
		insertValue(txtAdd, "Chennai OMR");

		WebElement txtnum = findElementBYId("cc_num");
		insertValue(txtnum, "9876543212345678");

		WebElement ccType = findElementBYId("cc_type");
		selectOption(ccType, "VISA");

		WebElement expMon = findElementBYId("cc_exp_month");
		selectOption(expMon, "12");

		WebElement expYr = findElementBYId("cc_exp_year");
		selectOption(expYr, "2022");

		WebElement txtcvv = findElementBYId("cc_cvv");
		insertValue(txtcvv, "123");

		WebElement btbBook = findElementBYId("book_now");
		click(btbBook);

		WebElement confirm = findElementBYXpath("//td[@class='login_title']");
		String con = getText(confirm);
		System.out.println(con);

	}
}














