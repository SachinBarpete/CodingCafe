package com.bridgelabz.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.DashboardPage;
import com.bridgelabz.pages.LoginPage;

/**
 * @author SachinBarpete
 * @purpose Tests for LoginPage
 */
public class LoginPageTest extends Base {

	LoginPage loginPage;
	DashboardPage dashboardPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test
	public void loginTest() {
		dashboardPage = loginPage.login();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
