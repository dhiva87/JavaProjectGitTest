package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBSignup extends Base {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=getDriver();
		loadUrl("https://www.facebook.com");
		SignUp s = new SignUp();
		WebElement txtUser = s.getTxtUser();
		type(txtUser,"dhiv@gmail.com");
		type(s.getTxtPass(),"123456");
		btnClick(s.getBtnLogin());
		Thread.sleep(4000);
		SignUp up = new SignUp();
		type(up.getTxtFirst(),"Dhiva");
		type(up.getTxtLast(),"gar");
		btnClick(up.getBtnGender().get(1));
		
	}

}
