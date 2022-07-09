package org.task.maven.MavenTasks;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Task  {
 @SuppressWarnings("static-access")
public static void main(String[] args) throws IOException {
	 LibGlobal libGlobal= new LibGlobal();
		libGlobal.getDriver();
		libGlobal.loadUrl("https://adactinhotelapp.com/index.php");
		libGlobal.maximize();
		WebElement txtUser = libGlobal.findElementBYId("username");
		String name = libGlobal.fileData("sheet1", 0, 0);
		libGlobal.insertValue(txtUser, name);
		WebElement txtPass = libGlobal.findElementBYId("password");
		String pass = libGlobal.fileData("sheet1", 1, 0);
		libGlobal.insertValue(txtPass, pass);
		WebElement btnLogin = libGlobal.findElementBYId("login");
		libGlobal.click(btnLogin);
		WebElement loc = libGlobal.findElementBYId("location");
		libGlobal.selectOption(loc, "Sydney");
		WebElement hotel = libGlobal.findElementBYId("hotels");
		libGlobal.selectOption(hotel, "Hotel Creek");
		WebElement type = libGlobal.findElementBYId("room_type");
		libGlobal.selectOption(type, "Double");
		WebElement btnsubmit = libGlobal.findElementBYId("Submit");
		libGlobal.click(btnsubmit);
	    //libGlobal.closeAll();
	
}
	
}

