package com.Opencart.Testcases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencart.Pages.HomePage;
import com.opencart.browser.WebDriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HomePageTest {
	private static WebDriver webDriver = null;
	private static HomePage homepage = null;
  
	@BeforeClass
	public static void setUp() throws IOException {
		Properties properties = new Properties();
		
		FileReader file = new FileReader("src/test/resources/application.properties");
		properties.load(file);
		
//		String browserName = properties.getProperty("browser.name");
//		webDriver = WebDriverFactory.getWebDriverInstance(browserName);
		
		WebDriverManager.chromedriver().setup();
		 webDriver=new ChromeDriver();
		
		String webPage = properties.getProperty("site.url");
		webDriver.navigate().to(webPage);
		
		
		homepage = new HomePage(webDriver);
	}
	
	
	@AfterClass
	public static void windUp() {
		webDriver.close();
	}
	
	
	//Homepage Functionality 
		@Test
		public void test01() {
			
			String expectedTitle = "OpenCart - Open Source Shopping Cart Solution";
			String actualTitle = webDriver.getTitle();
			
			Assert.assertEquals("OpenCart - Open Source Shopping Cart Solution page is not available",expectedTitle, actualTitle);
			
		}
		
		//Register Functionality
		@Test
		public void test02() { 
			
			String expectedTitle = "OpenCart - Account Register";
			String actualTitle = webDriver.getTitle();
			
			Assert.assertEquals("OpenCart - Account Register page is not available",expectedTitle, actualTitle);
			webDriver.navigate().back();
		}
		
		//MarketPlace Functionality
		@Test
		public void test03() {         
	
			String expectedFooter = "© Copyright 2022 OpenCart";
			String actualFooter = homepage.getTitle();
			
			Assert.assertEquals("© Copyright 2022 OpenCart page is not available",expectedFooter, actualFooter);
			webDriver.navigate().back();
		}
		
		//ViewDemo Functionality
		@Test
		public void test04() {
			
			String expectedTitle = "OpenCart - Demo";
			String actualTitle = webDriver.getTitle();
			
			Assert.assertEquals("OpenCart - Demo is not available",expectedTitle, actualTitle);
			webDriver.navigate().back();
		 
		}
		
		//Feature Functionality
		@Test
		public void test05() { 
			
			String expectedTitle = "OpenCart - Features";
			String actualTitle = webDriver.getTitle();
			
			Assert.assertEquals("OpenCart - Features is not available",expectedTitle, actualTitle);
			webDriver.navigate().back();
		}
		//Blog Functionality
		@Test
		public void test06() {
			
	        String expectedTitle = "OpenCart - Blog";
			String actualTitle = webDriver.getTitle();
			
			Assert.assertEquals("OpenCart - Blog is not available",expectedTitle, actualTitle);
			webDriver.navigate().back();
		}
	//  Download Functionality
		@Test
		public void test07() {
			
			String expectedFooter = "© Copyright 2022 OpenCart";
			String actualFooter = homepage.getTitle();
			
			Assert.assertEquals("© Copyright 2022 OpenCart page is not available",expectedFooter, actualFooter);
			
		  }

	
}
