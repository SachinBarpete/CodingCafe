package com.bridgelabz.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.DashboardPage;
import com.bridgelabz.pages.LoginPage;

public class DashboardPageTest extends Base {
	LoginPage loginPage;
	DashboardPage dashboardPage;

	public DashboardPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage = loginPage.login();
	}

	@Test
	public void dashBordPageTitleTest() {
		Assert.assertEquals(dashboardPage.getDashboardPageTitle(), "CodingCafe", "Title is not matched");
	}

	@Test
	public void add

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
