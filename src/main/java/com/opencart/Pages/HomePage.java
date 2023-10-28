package com.opencart.Pages;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;



public class HomePage {
	
	private WebDriver webDriver = null;
	
	//Homepage Functionality 1
	
	@FindBy (xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")
	@CacheLookup
	private WebElement feature_icon1;
	
	@FindBy (xpath = "\"/html/body/header/nav/div/div[1]/a/img\"")
	@CacheLookup
	private WebElement opencart_image;
	
	//Regester Functionality 2
	
	@FindBy (xpath = "//*[@id=\\\"navbar-collapse-header\\\"]/ul/li[1]/a")
	@CacheLookup
	private WebElement Regester_icon;
	
	@FindBy (id = "input-username")
	@CacheLookup
	private WebElement input_username;
	
	@FindBy (id = "input-firstname")
	@CacheLookup
	private WebElement input_firstname;
	
	@FindBy (id = "input-lastname")
	@CacheLookup
	private WebElement input_lastname;
	
	@FindBy (id = "input-email")
	@CacheLookup
	private WebElement input_email;
	
	@FindBy (name = "country_id")
	@CacheLookup
	private WebElement country_id;
	
	
	@FindBy (name = "password")
	@CacheLookup
	private WebElement password;
	
	@FindBy (xpath = "//*[@id=\"button-register\"]/button[1]")
	@CacheLookup
	private WebElement Regester_button;
	
	//MarketPlace Functionality 3
	
	@FindBy (xpath = "/html/body/header/nav/div/div[2]/ul/li[3]/a")
	@CacheLookup
	private WebElement MarketPlace_icon;
	
	@FindBy (xpath = "//*[@id=\"marketplace-extension\"]/div[2]/div/div[2]/div[1]/div[1]/div[1]/a[3]")
	@CacheLookup
	private WebElement Free_icon;
	
	@FindBy (xpath = "//*[@id=\"copyright\"]/ul/li[2]")
	@CacheLookup
	private WebElement actual_Footer1;
	
	//ViewDemo Functionality 4
	
	@FindBy (xpath = "//*[@id=\"hero\"]/div[1]/div[1]/div/p[2]/a[2]")
	@CacheLookup
	private WebElement ViewDemo_Functioanality;
	
	//Feature Functionality 5
	
	@FindBy (xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[1]/a")
	@CacheLookup
	private WebElement Feature_icon2;
	
	@FindBy (xpath = "//*[@id=\"cms-feature\"]/div[2]/ul/li[7]/a")
	@CacheLookup
	private WebElement Developer_icon;
	
	
	//Blog Functionality 6
	
	@FindBy (xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[4]/a")
	@CacheLookup
	private WebElement Blog_icon;
	
	@FindBy (xpath = "//*[@id=\"category\"]/ul/li[4]/a")
	@CacheLookup
	private WebElement Tips_and_Tricks;
	
	
    //  Download Functionality 7
	
	@FindBy (xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[5]/a")
	@CacheLookup
	private WebElement Download_icon;
	
	@FindBy (xpath = "//*[@id=\"copyright\"]/ul/li[2]")
	@CacheLookup
	private WebElement actual_Footer2;
	
	
	public HomePage() {
	}
	
	
	public HomePage(WebDriver webDriver, WebElement feature_icon1, WebElement opencart_image) {
		super();
		this.webDriver = webDriver;
		this.feature_icon1 = feature_icon1;
		this.opencart_image = opencart_image;
		
		PageFactory.initElements(webDriver,this);
	}
	
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
	
		PageFactory.initElements(webDriver, this);
	}
    
	
	public String getTitle() {
		return webDriver.getTitle();
	}
	
	
	public void feature_icon1() {
		this.feature_icon1.click();
	}
	
	public void opencart_image() {
		this.opencart_image.click();
	}
	public String getCurrentUrl() {
		return webDriver.getCurrentUrl();
	}
	//Register Functionality 2

	public void Regester_icon(){
		this.Regester_icon.click();
	}
	public void input_username() {
		this.input_username.sendKeys("Sunilkumar");
	}
	public void input_firstname() {
		this.input_firstname.sendKeys("Sunil");
	}
	public void input_lastname() {
		this.input_lastname.sendKeys("kumar");
	}
	public void input_email() {
		this.input_email.sendKeys("Sunilhiregowda@gmail.com");
	}
	public void country_id() {
		this.country_id.click();
	}
	public void password() {
		this.password.sendKeys("asdfghjk@1234");
	}
	public void Regester_button() {
		this.Regester_button.click();
	}

	//MarketPlace Functionality 3
	public void MarketPlace_icon() {
		this.MarketPlace_icon.click();
	}
	public void Free_icon() {
		this.Free_icon.click();
	}
	public void actual_Footer1() {
		this.actual_Footer1.getText();
	}

	//ViewDemo Functionality 4

	public void ViewDemo_Functioanality() {
		this.ViewDemo_Functioanality.click();
	}
	  

	//Feature Functionality 5

	public void Feature_icon2() {
		this.Feature_icon2.click();
	}
	public void Developer_icon() {
		this.Developer_icon.click();
	}

	//Blog Functionality 6


	public void Blog_icon() {
		this.Blog_icon.click();
	}
	public void Tips_and_Tricks() {
		this.Tips_and_Tricks.click();
	}

	//Download Functionality 7

	public void Download_icon() {
		this.Download_icon.click();
	}
	public void actual_Footer2() {
		this.actual_Footer2.getText();
	}

	

	public void maximizeBrowser() {
		webDriver.manage().window().maximize();
	}
	
	public void quitPage() {
		webDriver.quit();
	}

}
