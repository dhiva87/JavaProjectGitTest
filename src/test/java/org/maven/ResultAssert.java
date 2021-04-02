package org.maven;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ResultAssert {

	public static void main(String[] args) {
		Result rs = JUnitCore.runClasses(HelloSuite.class,GreensSuite.class);
		System.out.println("Run Count" +rs.getRunCount());
		System.out.println("Failure Count" +rs.getFailureCount());
		System.out.println("Ignore Count" +rs.getFailureCount());
		System.out.println("Run time" +rs.getRunTime());
		List<Failure> fa=rs.getFailures();
		for(Failure x:fa) {
			System.out.println(x);
		}

	}

}
