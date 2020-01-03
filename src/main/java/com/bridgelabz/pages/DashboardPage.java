package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.base.Base;

/**
 * @author Sachin Barpete
 * @purpose Implemented test methods for Dashboard 
 */
public class DashboardPage extends Base {

	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[@class='content'][contains(text(),'Campaign')]")
	WebElement campaign;

	@FindBy(xpath = "//p[contains(text(),'Drive')]")
	WebElement drive;

	@FindBy(xpath = "//p[contains(text(),'Settings')]")
	WebElement settings;

	@FindBy(xpath = "//div[contains(text(),'College')]")
	WebElement college;

	public String getDashboardPageTitle() {
		return driver.getTitle();
	}

	public CampaignPage campaignLink() {
		campaign.isEnabled();
		return new CampaignPage();
	}

	public Boolean collegeLink() {
		return college.isEnabled();
	}

	public DrivePage driveLink() {
		drive.click();
		return new DrivePage();
	}

	public SettingsPage settingsLink() {
		settings.click();
		return new SettingsPage();
	}

}
