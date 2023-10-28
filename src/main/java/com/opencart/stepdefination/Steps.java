package com.opencart.stepdefination;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private WebDriver webDriver;
	
	@Given("^open the opencart application in chrome browser$")
	public void open_the_opencart_application_in_chromebrowser() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.navigate().to("https://www.opencart.com/");
	}
	
	@When("^User click on feature icon $")
	public void user_click_on_feature_icon () {
		webDriver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")).click();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@And("^Click on image logo $")
	public void Click_on_image_logo() {
		webDriver.findElement(By.xpath("/html/body/header/nav/div/div[1]/a/img")).click();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Then("^The opencart Homepage is opened$")
	public void The_pencart_Homepage_is_opened() {
		String expectedTitle = "OpenCart - Open Source Shopping Cart Solution";
		String actualTitle = webDriver.getTitle();
		Assert.assertEquals("OpenCart - Open Source Shopping Cart Solution page is not available",expectedTitle, actualTitle);
		webDriver.close();
	}
	
	//Register Functionality 2
	
		@Given("^open the opencart application in chrome browser2$")
		public void open_the_opencart_application_in_chrome_browser2() {
	        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
			
			webDriver = new ChromeDriver();
			webDriver.manage().window().maximize();
			webDriver.navigate().to("https://www.opencart.com/");
		}
		
		@When("^user fills all details then click button$")
		public void user_fills_all_details_then_click_button() {
			webDriver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]")).click();
			webDriver.findElement(By.id("input-username")).sendKeys("Sunilkumar");
			webDriver.findElement(By.id("input-firstname")).sendKeys("Sunil");
			webDriver.findElement(By.id("input-lastname")).sendKeys("kumar");
			webDriver.findElement(By.id("input-email")).sendKeys("Sunilhiregowda@gmail.com");
			webDriver.findElement(By.name("country_id")).click();
			webDriver.findElement(By.name("password")).sendKeys("asdfghjk@1234");
			
			webDriver.findElement(By.xpath("//*[@id=\"button-register\"]/button[1]")).click();
			
			webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		@Then("^Register is done successful$")
		public void Register_is_done_successful() {
			String expectedTitle = "OpenCart - Account Register";
			String actualTitle = webDriver.getTitle();
			Assert.assertEquals("OpenCart - Account Register page is not available",expectedTitle, actualTitle);
			
			webDriver.close();
		}
		
		//MarketPlace Functionality 3
		
			@Given("^open the opencart application in chrome browser3$")
			public void open_the_opencart_application_in_chrome_browser3() {
		        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				
				webDriver = new ChromeDriver();
				webDriver.manage().window().maximize();
				webDriver.navigate().to("https://www.opencart.com/");
			}
			
			@When("^user click on MarkrtPlace button$")
			public void user_click_on_MarkrtPlace_button () {
				webDriver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[3]/a")).click();
				webDriver.findElement(By.xpath("//*[@id=\"marketplace-extension\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/a[3]")).click();
				
				webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			@Then("^successfully clicked on MarketPlace$")
			public void successfully_clicked_on_MarketPlace() {
				String expectedFooter = "© Copyright 2022 OpenCart";
				String actualFooter = webDriver.findElement(By.xpath("//*[@id=\"copyright\"]/ul/li[2]")).getText();
				Assert.assertEquals("© Copyright 2022 OpenCart page is not available",expectedFooter, actualFooter);
				
				webDriver.close();
			}
			
	     //ViewDemo Functionality 4
		   
			@Given("^open the opencart application in chrome browser4$")
			public void open_the_opencart_application_in_chrome_browser4() {
		        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				
				webDriver = new ChromeDriver();
				webDriver.manage().window().maximize();
				webDriver.navigate().to("https://www.opencart.com/");
			}
			
			@When("^user click on ViewDemo button$")
			public void user_click_on_ViewDemo_button() {
				webDriver.findElement(By.xpath("//*[@id=\"hero\"]/div[1]/div[1]/div/p[2]/a[2]")).click();
				webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			@Then("^successfully clicked on ViewDemo$")
			public void successfully_clicked_on_ViewDemo() {
				String expectedTitle = "OpenCart - Demo";
				String actualTitle = webDriver.getTitle();
				Assert.assertEquals("OpenCart - Demo is not available",expectedTitle, actualTitle);
				
				webDriver.close();
			}
			
			//Feature Functionality 5
			
			@Given("^open the opencart application$")
			public void open_the_opencart_application() {
		        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				
				webDriver = new ChromeDriver();
				webDriver.manage().window().maximize();
				webDriver.navigate().to("https://www.opencart.com/");
			}
			
			@When("^user click on Feature button$")
			public void user_click_on_Feature_button() {
				webDriver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")).click();
				webDriver.findElement(By.xpath("//*[@id=\"cms-feature\"]/div[2]/ul/li[7]/a")).click();
				
				webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			@Then("^successfully clicked on ViewDemo$")
			public void successfully_clicked_on_Feature() {
				String expectedTitle = "OpenCart - Features";
				String actualTitle = webDriver.getTitle();
				Assert.assertEquals("OpenCart - Features is not available",expectedTitle, actualTitle);
			
				webDriver.close();
			}
			
			//Blog Functionality 6
			
			@Given("^open the opencart application in chrome1$")
			public void open_the_opencart_application_in_chrome1() {
		        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				
				webDriver = new ChromeDriver();
				webDriver.manage().window().maximize();
				webDriver.navigate().to("https://www.opencart.com/");
			}
			
			@When("^user click on Blog button$")
			public void user_click_on_Blog_button() {
				webDriver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[4]/a")).click();
				webDriver.findElement(By.xpath("//*[@id=\"category\"]/ul/li[4]/a")).click();
				
				webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			@Then("^successfully clicked on Blog$")
			public void successfully_clicked_on_Blog() {
				String expectedTitle = "OpenCart - Blog";
				String actualTitle = webDriver.getTitle();
				Assert.assertEquals("OpenCart - Blog is not available",expectedTitle, actualTitle);
				
				webDriver.close();
			}
			
		//  Download Functionality 7
			
			@Given("^open the opencart application in chrome2$")
			public void open_the_opencart_application_in_chrome2() {
		        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
				
				webDriver = new ChromeDriver();
				webDriver.manage().window().maximize();
				webDriver.navigate().to("https://www.opencart.com/");
			}
			
			@When("^user click on Download button$")
			public void user_click_on_Download_button() {
				webDriver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/ul/li[5]/a")).click();
				
				webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			@Then("^successfully clicked on Download$")
			public void successfully_clicked_on_Download() {
				String expectedFooter = "© Copyright 2022 OpenCart";
				String actualFooter = webDriver.findElement(By.xpath("//*[@id=\"copyright\"]/ul/li[2]")).getText();
				Assert.assertEquals("© Copyright 2022 OpenCart page is not available",expectedFooter, actualFooter);
				
				webDriver.close();
			}
			

}
