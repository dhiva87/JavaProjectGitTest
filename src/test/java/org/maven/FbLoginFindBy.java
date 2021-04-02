package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FbLoginFindBy extends Base{

	public static void main(String[] args) {
		WebDriver d=getDriver();
		loadUrl("https://www.facebook.com");
		SampleFindBy s = new SampleFindBy();
		WebElement txtUser = s.getTxtUser();
		type(txtUser,"dhiv@gmail.com");
		type(s.getTxtPass(),"123456");
		driver.navigate().refresh();
		type(txtUser,"Meera");


	}

}
