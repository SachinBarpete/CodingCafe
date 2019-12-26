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

	@FindBy(id = "identifierId")
	WebElement email;

	@FindBy(xpath = "//div[@id='identifierNext']//span[@class='CwaK9']")
	WebElement emailnext;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement passwordNext;
}
