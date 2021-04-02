package org.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookBase extends Base {

	public static void main(String[] args) {
		WebDriver d=getDriver();
		loadUrl("https://.facebook.com");
		WebElement txtUser = d.findElement(By.id("email"));
		type(txtUser,"dhiv@gmail.com");
		WebElement txtPass = d.findElement(By.id("pass"));
		type(txtPass,"1234567");
		WebElement btn = d.findElement(By.name("login"));
		btnClick(btn);
}
}
