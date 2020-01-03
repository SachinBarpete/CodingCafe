package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;
import com.bridgelabz.util.Util;

/**
 * @author Sachin Barpete
 * @purpose Implemented test methods for Campaign 
 */
public class CampaignPage extends Base {

	public CampaignPage() {
		super();
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

	@FindBy(xpath = "//div[contains(text(),'Online Campaign')]")
	WebElement selectOnlineCampaign;

	@FindBy(xpath = "//div[@class='mat-radio-label-content'][contains(text(),'Referral')]")
	WebElement selectReferral;

	@FindBy(xpath = "//div[@class='mat-radio-label-content'][contains(text(),'Offline')]")
	WebElement selectOffline;

	@FindBy(xpath = "//input[@ng-reflect-maxlength =50]")
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

	@FindBy(xpath = "//div[@class='mat-calendar-arrow']")
	WebElement selectDate;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*")
	WebElement startDate;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[1]/div[2]/mat-form-field[2]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*")
	WebElement endDate;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]/div[1]")
	WebElement questionSetFormat;

	@FindBy(xpath = "//span[contains(text(),'TestJava')]")
	WebElement selectQuestionFormat;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[2]/div[1]/mat-form-field[2]/div[1]/div[1]/div[3]/input[1]")
	WebElement maximumAttempts;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancel;

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement submit;

	public void addOnlineCampaignForRegistration() throws InterruptedException {
		Thread.sleep(500);
		addCTA.click();
		Thread.sleep(500);
		addCampaign.click();
		Thread.sleep(500);
		campaignName.sendKeys(properties.getProperty("campaignName"));
		Thread.sleep(500);
		campaignPurpose.click();
		selectRegistration.click();
		creatorName.sendKeys(properties.getProperty("creatorName"));
		shortName.sendKeys(properties.getProperty("shortName"));

		startDate.click();
		Thread.sleep(200);
		selectDate.click();
		String startDate = "6-JAN-2020";
		Util.selectDate(startDate, driver);

		endDate.click();
		Thread.sleep(200);
		selectDate.click();
		String endDate = "15-JAN-2020";
		Util.selectDate(endDate, driver);
		// submit.click();
		Thread.sleep(2000);
	}

	public void addOnlineCampaignForMCQ() throws InterruptedException {
		Thread.sleep(500);
		addCTA.click();
		Thread.sleep(500);
		addCampaign.click();
		Thread.sleep(500);
		campaignName.sendKeys(properties.getProperty("campaignName"));
		Thread.sleep(500);
		campaignPurpose.click();
		selectMCQ.click();
		creatorName.sendKeys(properties.getProperty("creatorName"));
		shortName.sendKeys(properties.getProperty("shortName"));

		startDate.click();
		Thread.sleep(200);
		selectDate.click();
		String startDate = "6-JAN-2020";
		Util.selectDate(startDate, driver);

		endDate.click();
		Thread.sleep(200);
		selectDate.click();
		String endDate = "15-JAN-2020";
		Util.selectDate(endDate, driver);
		Thread.sleep(200);
		questionSetFormat.click();
		Thread.sleep(100);
		selectQuestionFormat.click();
		Thread.sleep(200);
		maximumAttempts.sendKeys(properties.getProperty("maximumAttempts"));
		Thread.sleep(200);

		Thread.sleep(2000);
	}

	public void addReferral() {

	}

	public void addOffline() {

	}

}
