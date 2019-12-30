package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.base.Base;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='mat-button-wrapper']")
	WebElement googleLogin;

	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement email;

	@FindBy(xpath = "//div[@id='identifierNext']")
	WebElement emailNext;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//div[@id='passwordNext']")
	WebElement passwordNext;

	public DashboardPage login() {
		googleLogin.click();
		String parentWindow = driver.getWindowHandle();
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		email.sendKeys(properties.getProperty("email"));
		emailNext.click();
		password.sendKeys(properties.getProperty("password"));
		passwordNext.click();
		driver.switchTo().window(parentWindow);
		return new DashboardPage();
	}

}
