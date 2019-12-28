package com.bridgelabz.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.CampaignPage;
import com.bridgelabz.pages.DashboardPage;
import com.bridgelabz.pages.LoginPage;

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
		dashboardPage = loginPage.login();
	}

	@Test
	public void addOnlineCampaignTest() throws InterruptedException {
		campaignPage = dashboardPage.campaignLink();
		campaignPage.addOnlineCampaign();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
