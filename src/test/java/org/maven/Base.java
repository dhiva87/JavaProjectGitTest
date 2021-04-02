package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\revathy\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static String title() {
		String ti = driver.getTitle();
		return ti;
	}

	public static void type(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void btnClick(WebElement ele) {
		ele.click();
	}

	public static String attribute(WebElement ele, String attriName) {
		String at = ele.getAttribute(attriName);
		return at;
	}
}