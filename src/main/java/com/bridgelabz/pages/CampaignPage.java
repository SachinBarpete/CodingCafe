package com.bridgelabz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;

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

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*")
	WebElement startDate;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/app-online-campaign[1]/div[1]/div[4]/div[1]/div[2]/mat-form-field[2]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*")
	WebElement endDate;

	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancel;

	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	WebElement submit;

	public void addOnlineCampaign() throws InterruptedException {
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
		String date = "30-DEC-2019";
		String dateArray[] = date.split("-");
		String day = dateArray[0];
		String month = dateArray[1];
		String year = dateArray[2];

		boolean flag = false;
		String dayValue = null;
		for (int rowNum = 2; rowNum <= 7; rowNum++) {
			for (int colNum = 1; colNum <= 7; colNum++) {
				try {
					dayValue = driver.findElement(By.xpath("//tr[" + rowNum + "]//td[" + colNum + "]//div[1]"))
							.getText();
				} catch (NoSuchElementException e) {
					System.out.println("Please enter a correct date");
				}

				if (dayValue.equals(day)) {
					driver.findElement(By.xpath("//tr[" + rowNum + "]//td[" + colNum + "]//div[1]")).click();
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}

		Thread.sleep(5000);
	}

	public void addReferral() {

	}

	public void addOffline() {

	}

}
