package com.bridgelabz.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.bridgelabz.util.Util;
import com.bridgelabz.util.WebEventListener;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	public static EventFiringWebDriver eventFiringWebdriver;
	public static WebEventListener eventListener;

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

	public void initialization() {
		String browserName = properties.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Driver/geckodriver");
			driver = new FirefoxDriver();
		}

		eventFiringWebdriver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		eventFiringWebdriver.register(eventListener);
		driver = eventFiringWebdriver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	}

}
