package com.bridgelabz.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.RegisterPage;

/**
 * @author SachinBarpete
 * @purpose Tests for RegisterPage
 */
public class RegisterPageTest extends Base {

	RegisterPage registerPage;

	public RegisterPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		registerPage = new RegisterPage();
		driver.navigate().to(properties.getProperty("registerLink"));
	}

	@Test
	public void registrationTest() throws InterruptedException {
		registerPage.registrationTest();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
