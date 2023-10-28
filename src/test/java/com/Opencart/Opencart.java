package com.Opencart;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Opencart {
public static WebDriver driver = null;
	
	@BeforeClass
	public static void setup() {
		String driverPath = "lib/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void windup() {
		driver.close();
	}
	//Homepage Functionality 
	@Test
	public void test01() {
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/header/nav/div/div[1]/a/img")).click();
		
		String expectedTitle = "OpenCart - Open Source Shopping Cart Solution";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("OpenCart - Open Source Shopping Cart Solution page is not available",expectedTitle, actualTitle);
		
	}
	//Register Functionality
	@Test
	public void test02() {
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
		driver.findElement(By.id("input-username")).sendKeys("Sunilkumar");
		driver.findElement(By.id("input-firstname")).sendKeys("Sunil");
		driver.findElement(By.id("input-lastname")).sendKeys("kumar");
		driver.findElement(By.id("input-email")).sendKeys("Sunilhiregowda@gmail.com");
		driver.findElement(By.name("country_id")).click();
		driver.findElement(By.name("password")).sendKeys("asdfghjk@1234");
		
		driver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();
		
		String expectedTitle = "OpenCart - Account Register";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("OpenCart - Account Register page is not available",expectedTitle, actualTitle);
		
	}
	
	//MarketPlace Functionality
	@Test
	public void test03() {
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"marketplace-extension\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/a[3]")).click();
		
		String expectedFooter = "© Copyright 2022 OpenCart";
		String actualFooter = driver.findElement(By.xpath("//*[@id=\"copyright\"]/ul/li[2]")).getText();
		Assert.assertEquals("© Copyright 2022 OpenCart page is not available",expectedFooter, actualFooter);
		
	}
	//ViewDemo Functionality
	@Test
	public void test04() {
		driver.get("https://www.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"hero\"]/div[1]/div[1]/div/p[2]/a[2]")).click();
		
		String expectedTitle = "OpenCart - Demo";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("OpenCart - Demo is not available",expectedTitle, actualTitle);
		
	 
	}
	//Feature Functionality
	@Test
	public void test05() {
		driver.get("https://www.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[7]/a")).click();
		
		String expectedTitle = "OpenCart - Features";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("OpenCart - Features is not available",expectedTitle, actualTitle);
	}
	//Blog Functionality
	@Test
	public void test06() {
		driver.get("https://www.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[4]/a")).click();
		
		String expectedTitle = "OpenCart - Blog";
		String actualTitle = driver.getTitle();
		Assert.assertEquals("OpenCart - Blog is not available",expectedTitle, actualTitle);
		
	}
//  Download Functionality
	@Test
	public void test07() throws IOException {
		driver.get("https://www.opencart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[5]/a")).click();
		
		String expectedFooter = "© Copyright 2022 OpenCart";
		String actualFooter = driver.findElement(By.xpath("//*[@id=\"copyright\"]/ul/li[2]")).getText();
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrShotFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		String destinationFileName = "opencart_" +(new Date()).getTime() + ".png";
		File destinationFile = new File("screenShots/" + destinationFileName);
		FileUtils.copyFile(scrShotFile ,destinationFile);
		
		Assert.assertEquals("© Copyright 2022 OpenCart page is not available",expectedFooter, actualFooter);
		
	  }
}
