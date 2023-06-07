package org.Demo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoMenuPage {

	WebDriver driver;

	public DemoMenuPage(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
										// test case
		// TODO Auto-generated constructor stub
		this.driver = driver; 
		PageFactory.initElements(driver, this);// initialise the elements       
	}
	
	@FindBy(xpath = "//*[contains(text(),'Computers')]")
	public WebElement ComputerButtonClick;
	
	@FindBy(xpath = "//img[@title='Show products in category Desktops'][1]")
	public WebElement clickonDesktop;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	public WebElement addProdcutToCart;
	
	public void menuNavigation() {
		ComputerButtonClick.click();
		clickonDesktop.click();
		addProdcutToCart.click();
	}
	
	
	
	
	
}