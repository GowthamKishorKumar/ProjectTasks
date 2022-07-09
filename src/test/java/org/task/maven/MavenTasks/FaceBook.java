package org.task.maven.MavenTasks;

import org.openqa.selenium.WebElement;

public class FaceBook extends LibGlobal {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		LibGlobal lib = new LibGlobal();
		getDriver();
		lib.loadUrl("https://www.facebook.com/login/");
		lib.maximize();
		WebElement id = lib.findElementBYId("email");
		lib.insertValue(id, "7639833428");
		WebElement pass = lib.findElementBYId("pass");
		lib.insertValue(pass, "gowthamgkk");
		WebElement btn = lib.findElementBYName("login");
		lib.click(btn);
		
		
	}

}
