package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;

public class MCQPage extends Base {

	public MCQPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//mat-card[@class='main-card mat-card']//mat-icon[@class='add mat-icon notranslate material-icons mat-icon-no-color'][contains(text(),'add')]")
	WebElement testDurationADD_CTA;

	@FindBy(xpath = "//input[@id='mat-input-13']")
	WebElement testTime;
	
	@FindBy(xpath = "//input[@id='mat-input-14']")
	WebElement testName;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath = "//span[contains(text(),'Create')]")
	WebElement create;
	
}
