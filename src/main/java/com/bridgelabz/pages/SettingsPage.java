package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;

public class SettingsPage extends Base {

	public SettingsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Settings')]")
	WebElement settings;

	@FindBy(xpath = "////p[contains(text(),'MCQ')]")
	WebElement MCQ;

	@FindBy(xpath = "//p[@class='sidenav-option-selected']")
	WebElement questionFormat;

	@FindBy(xpath = "//p[contains(text(),'Questions')]")
	WebElement questions;

	@FindBy(xpath = "//p[@class='sidenav-option'][contains(text(),'Campaign')]")
	WebElement campaign;

	@FindBy(xpath = "//p[contains(text(),'ET Correction')]")
	WebElement ETCorrection;

	public Boolean MCQLink() {
		MCQ.click();
		return questionFormat.isEnabled();
	}

	public void questionsLink() {
		questions.click();
	}

	public void campaignLink() {
		campaign.click();
	}

	public void ETCorrectionLink() {
		ETCorrection.click();
	}
}
