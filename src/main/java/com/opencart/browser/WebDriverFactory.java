package com.opencart.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	private static final String CHROME = "chrome";
	private static final String FIREFOX = "firefox";
	private static final String MICROSOFTEDGE = "microsoft edge";

	//Constructor
	public WebDriverFactory() {
		
	}
	
	public static WebDriver getWebDriverInstance(String browserName) {
		WebDriver webDriver = null;
		
		if(CHROME.equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			webDriver = new ChromeDriver();
		}
		else if(FIREFOX.equalsIgnoreCase(browserName)) {
			System.setProperty("webdriver.firefox.driver", "lib/firefoxdriver.exe");
			webDriver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.msedge.driver", "lib/msedgedriver.exe");
			webDriver = new MicroSoftEdgeDriver();
		}
		return webDriver;
   }
}