package org.Demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DemoHomePage {

	// 1. Constructor
	// 2. Page locator
	// 3. Methods that will interact with the page locators
	// 4. Driver carry forward

//		driver.findElement(By.id("nav-link-accountList")).click();

	WebDriver driver;// base class reference

	public DemoHomePage(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	
	@FindBy(xpath = "//*[@alt='Tricentis Demo Web Shop']")
	public WebElement demoWebShopLogo;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement register;
	
	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	public WebElement login;
	
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	public WebElement shopingcart;
	
	@FindBy(xpath = "//span[contains(text(),'Wishlist')]")
	public WebElement wishlist;

	public void verifyHomeScreenButtons() {
		
		System.out.println(demoWebShopLogo.isDisplayed());
		Assert.assertTrue(demoWebShopLogo.isDisplayed(), "demoWebShopLogo is no Displayed");
		
		System.out.println(register.isDisplayed());
		Assert.assertTrue(register.isDisplayed(), "Register logo is not Displayed"); // to check  register
		
		
		System.out.println(login.isDisplayed());
		Assert.assertTrue(login.isDisplayed(), "Login logo is not Displayed"); // to check login
		
		
		System.out.println(shopingcart.isDisplayed());
		Assert.assertTrue(shopingcart.isDisplayed(), "Shoppingcart logo is not Displayed"); // to check Soppiing
		
		System.out.println(wishlist.isDisplayed());
		Assert.assertTrue(wishlist.isDisplayed(), "Shoppingcart logo is not Displayed"); // to check  wishlist
		
		
		
			
		
			
		
		

	}

}