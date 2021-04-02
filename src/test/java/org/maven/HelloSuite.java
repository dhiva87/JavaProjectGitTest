package org.maven;

import org.junit.Assert;
import org.junit.Test;

public class HelloSuite {
	@Test
	public void test() {
		Assert.assertTrue(true);
		System.out.println("Test in Hello");
	}

	@Test
	public void test1() {
		Assert.assertTrue(false);
		System.out.println("Test1 in Hello");
	}
	@Test
	public void test2() {
		Assert.assertEquals("Dhivagar", "Dhivagar");
		System.out.println("Test2 in Hello");
	}
	@Test
	public void test3() {
		Assert.assertEquals("Dhivagar", "dhivagar");
		System.out.println("Test3 in Hello");
	}
}
