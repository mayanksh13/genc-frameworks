package com.cogni.genc.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegisterPage {
	
	public WebDriver driver;	
	
	public AccountRegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy annotation replaces driver.findElement.
	// Code looks clean but bulky 
	
	@FindBy(xpath = ".//a[@class='btn btn-primary']")
	WebElement newCust;
	
	@FindBy(name = "firstname")
	WebElement fname;
	
	@FindBy(name = "lastname")
	WebElement lname;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "telephone")
	WebElement telephone;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "confirm")
	WebElement confirm;
	
   public void testLogin() {
		
		System.out.println("5>> Driver Id-"+driver);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		System.out.println("Inside test case");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		newCust.click();
	}
	
	
	public void enterDetails() {
		
		fname.sendKeys("Rohit");
		lname.sendKeys("Ranjan");
		email.sendKeys("rohit125@gmail.com");
		telephone.sendKeys("2323433343");
		password.sendKeys("rohit125");
		confirm.sendKeys("rohit125");
	}
	
}
