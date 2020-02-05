package com.bridgelabz.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.CampaignPage;
import com.bridgelabz.pages.DashboardPage;
import com.bridgelabz.pages.LoginPage;

/**
 * @author SachinBarpete
 * @purpose Tests for CampaignPage
 */
public class CampaignPageTest extends Base {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	CampaignPage campaignPage;

	public CampaignPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage = loginPage.login()for Initialize driver and properties file;
	}

	@Test
	public void addOnlineCampaignForRegistrationTest() throws InterruptedException {
		campaignPage = dashboardPage.campaignLink();
		campaignPage.addOnlineCampaignForRegistration();
	}

	@Test
	public void addOnlineCampaignForMCQTest() throws InterruptedException {
		campaignPage = dashboardPage.campaignLink();
		campaignPage.addOnlineCampaignForMCQ();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
