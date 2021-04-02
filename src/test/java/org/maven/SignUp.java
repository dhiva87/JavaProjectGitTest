package org.maven;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp extends Base {
public SignUp() {
	PageFactory.initElements(driver, this);
}
	@FindBy(id = "email")
	private WebElement txtUser;
	@FindBy(name = "pass")
	private WebElement txtPass;
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement btnLogin;
	@FindBy(name = "firstname")
	private WebElement txtFirst;
	@FindBy(name = "lastname")
	private WebElement txtLast;
	@FindBy(xpath = "//input[@name='sex']")
	private List<WebElement> btnGender;
	public WebElement getTxtFirst() {
		return txtFirst;
	}
	public WebElement getTxtLast() {
		return txtLast;
	}
	public List<WebElement> getBtnGender() {
		return btnGender;
	}
	public WebElement getTxtUser() {
		return txtUser;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
