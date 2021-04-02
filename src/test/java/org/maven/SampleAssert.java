package org.maven;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SampleAssert {
	public static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\revathy\\eclipse-workspace\\SeleniumProject\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	@Before
	public void before() {
		Date d=new Date();
		System.out.println("Start Time" +d);
	}
	@After
	public void after() {
		Date d=new Date();
		System.out.println("End Time" +d);
	}
	@Test
	public void test() {
		String url=driver.getCurrentUrl();
		boolean b=url.contains("facebook");
		Assert.assertTrue("Verify Url", b);
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("dhiv");
		String at=txtUser.getAttribute("value");
		Assert.assertEquals("Verify Username", "dhiv", at);
	}
	@Test
	public void test1() {
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("12345");
		String att=txtPass.getAttribute("value");
		Assert.assertEquals("Verify Password", "12345", att);
	}
}
