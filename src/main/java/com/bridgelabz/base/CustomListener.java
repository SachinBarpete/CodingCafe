package com.bridgelabz.base;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bridgelabz.util.Util;

/**
 * @author Sachin Barpete
 * @purpose Take screen shot for failure and skipped test cases
 */
public class CustomListener implements ITestListener {

	/**
	 * take screen shot for failure test case
	 */
	@Override
	public void onTestFailure(ITestResult result) {
		Util.takeScreenshot(result.getMethod().getMethodName());
	}

	/**
	 * take screen shot for skipped test case
	 */
	@Override
	public void onTestSkipped(ITestResult result) {
		Util.takeScreenshot(result.getMethod().getMethodName());
	}
}
