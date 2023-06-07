// package org.Manipal.pageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//
//public class HomePage {
//
//	// 1. Constructor
//	// 2. Page locator
//	// 3. Methods that will interact with the page locators
//	// 4. Driver carry forward
//
////		driver.findElement(By.id("nav-link-accountList")).click();
//
//	WebDriver driver;// base class reference
//
//	public HomePage(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
//										// test case
//		this.driver = driver;
//		PageFactory.initElements(driver, this);// initialise the elements
//	}
//	
//	@FindBy(id = "nav-link-accountList")
//	public WebElement signInButton;
//
//	public void verifyHomeLaunchSuccess() {
//		System.out.println(signInButton.isDisplayed());
//		Assert.assertTrue(signInButton.isDisplayed(), "SignInButton is not	 Displayed");
//
//	}
//
//}
