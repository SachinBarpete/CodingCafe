package com.bridgelabz.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bridgelabz.base.Base;

public class Util extends Base {

	public static long PAGE_LOAD_TIME = 50;
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

	public static void selectDate(String date, WebDriver driver) throws InterruptedException {

		String dateArray[] = date.split("-");
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];

		String yearXpath = "//div[contains(text(),'" + year + "')]";
		Thread.sleep(200);
		driver.findElement(By.xpath(yearXpath)).click();
		String monthXpath = "//div[contains(text(),'" + month + "')]";
		Thread.sleep(200);
		driver.findElement(By.xpath(monthXpath)).click();

		boolean flag = false;
		String dayValue = null;
		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= 7; colNum++) {
				try {
					dayValue = driver.findElement(By.xpath("//tr[" + rowNum + "]//td[" + colNum + "]//div[1]"))
							.getText();
				} catch (NoSuchElementException e) {
				}
				if (dayValue.equals(day)) {
					driver.findElement(By.xpath("//tr[" + rowNum + "]//td[" + colNum + "]//div[1]")).click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}
	}

}
