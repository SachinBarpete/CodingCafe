package com.bridgelabz.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.DashboardPage;
import com.bridgelabz.pages.LoginPage;

/**
 * @author SachinBarpete
 * @purpose Tests for DashboardPage
 */
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
	public void campaignLinkTest() {
		dashboardPage.campaignLink();
	}

	@Test
	public void collegeLinkTest() {
		dashboardPage.collegeLink();
	}

	@Test
	public void driveLinkTest() {
		dashboardPage.driveLink();
	}

	@Test
	public void SettingsLinkTest() {
		dashboardPage.settingsLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
