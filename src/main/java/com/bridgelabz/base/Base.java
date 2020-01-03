package com.bridgelabz.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.bridgelabz.util.Util;

/**
 * @author SachinBarpete
 * @purpose for Initialize driver and properties file
 */
public class Base {

	public static WebDriver driver;
	public static Properties properties;

	public Base() {
		properties = new Properties();
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/bridgelabz/config/config.properties");
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialize driver
	 */
	public void initialization() {
		String browserName = properties.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/Drivers/chromedriver_linux64/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/Drivers/geckodriver-v0.26.0-linux64/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(properties.getProperty("URL"));
	}

}
