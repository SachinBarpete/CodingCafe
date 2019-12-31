package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;

public class RegisterPage extends Base {

	public RegisterPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@ng-reflect-name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@ng-reflect-name='fullName']")
	WebElement fullName;

	@FindBy(xpath = "//div[contains(text(),'Male')]")
	WebElement gender;

	@FindBy(xpath = "//input[@ng-reflect-name='phoneno']")
	WebElement phoneNo;

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement apply;

	@FindBy(xpath = "//input[@ng-reflect-name='otp']")
	WebElement otp;

	public void registrationTest() throws InterruptedException {

		email.sendKeys(properties.getProperty("registerEmail"));
		Thread.sleep(100);
		fullName.sendKeys(properties.getProperty("fullName"));
		Thread.sleep(100);
		gender.click();
		phoneNo.sendKeys(properties.getProperty("phoneNo"));
		Thread.sleep(100);
		apply.click();
		Thread.sleep(500);
		otp.sendKeys("100");
		Thread.sleep(500);
		apply.click();
		
		
		Thread.sleep(5000);
	}

}
