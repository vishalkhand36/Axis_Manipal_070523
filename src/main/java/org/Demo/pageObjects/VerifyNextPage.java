package org.Demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyNextPage {
	WebDriver driver;

	public VerifyNextPage(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
											// test case
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);// initialise the elements
	}
	
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-72']")
	public WebElement addCartButton;
	
	public void addCartButtonVerification() {
		
//		addCartButton.click();
		System.out.println(addCartButton.isDisplayed());
		Assert.assertEquals(addCartButton.isDisplayed(), true);
//		Assert.assertEquals("Add cart is not visible is not Displayed", addCartButton.isDisplayed()); 
	}
	
}