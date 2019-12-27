package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridgelabz.base.Base;

public class CampaignPage extends Base {

	public CampaignPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'College')]")
	WebElement college;

	@FindBy(xpath = "//div[contains(text(),'Training Institute')]")
	WebElement TrainingInstitute;

	@FindBy(xpath = "//div[contains(text(),'Online Campaign')]")
	WebElement onlineCampaign;

	@FindBy(xpath = "//div[contains(text(),'Referral')]")
	WebElement referral;

	@FindBy(xpath = "//div[contains(text(),'Offline')]")
	WebElement offline;

	@FindBy(xpath = "//div[@class='addicon']//img")
	WebElement addCTA;

	@FindBy(xpath = "//button[contains(text(),'Campaign')]")
	WebElement addCampaign;

	@FindBy(xpath = "//button[contains(text(),'Institutions')]")
	WebElement addInstitutions;

	@FindBy(xpath = "//div[@class='mat-radio-label-content'][contains(text(),'Online Campaign')]")
	WebElement selectOnlineCampaign;

	@FindBy(xpath = "//div[@class='mat-radio-label-content'][contains(text(),'Referral')]")
	WebElement selectReferral;

	@FindBy(xpath = "//div[@class='mat-radio-label-content'][contains(text(),'Offline')]")
	WebElement selectOffline;

	@FindBy(xpath = "//input[@id='mat-input-85']")
	WebElement campaignName;

	@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
	WebElement campaignPurpose;

	@FindBy(xpath = "//span[@class='mat-option-text'][contains(text(),'MCQ')]")
	WebElement selectMCQ;

	@FindBy(xpath = "//span[contains(text(),'Registration')]")
	WebElement selectRegistration;

	@FindBy(xpath = "//input[@ng-reflect-maxlength =35]")
	WebElement creatorName;

	@FindBy(xpath = "//input[@ng-reflect-maxlength =15]")
	WebElement shortName;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*")
	WebElement startDate;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[1]/div[2]/mat-form-field[2]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*")
	WebElement endDate;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancel;

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement submit;

	public void addOnlineCampaign() {
		addCampaign.click();
		selectOnlineCampaign.click();
		campaignName.sendKeys(properties.getProperty("campaignName"));

		Select selectCampaignPurpose = new Select(campaignPurpose);
		selectCampaignPurpose.selectByVisibleText(properties.getProperty("campaignPurpose"));

	}

	public void addReferral() {

	}

	public void addOffline() {

	}

}
