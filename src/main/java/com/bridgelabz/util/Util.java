package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.bridgelabz.base.Base;

public class Util extends Base {

	public static long PAGE_LOAD_TIME = 45;
	public static long IMPLICIT_WAIT_TIME = 30;

	public static void takeScreenshot() {
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile,
					new File(System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param testMethodName
	 * @purpose to take the screenshot
	 */
	public static void takeScreenshot(String testMethodName) {

		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshots/" + testMethodName
					+ "_" + System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
