package com.cogni.genc.testcases2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.cogni.genc.Pages.AccountLoginPage;

public class BaseTest {
	
	
	protected WebDriver driver;
	AccountLoginPage page;
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("1>>Driver Id-"+driver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("2>>Driver Id-"+driver);
		
	}
	
	@BeforeTest
	public void initializeObject() {
		
		page = new AccountLoginPage(driver);
	}
	

}
