package com.bridgelabz.pages;

import org.openqa.selenium.support.PageFactory;
import com.bridgelabz.base.Base;

public class DashboardPage extends Base {

	// Initializing the page Objects
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

}
