package com.bridgelabz.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.base.Base;

/**
 * @author Sachin Barpete
 * @purpose Implement test methods for Drive 
 */
public class DrivePage extends Base {

	public DrivePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='add-btn']")
	WebElement addCTA;

	public void addCTALink() {
		addCTA.click();
	}

}
