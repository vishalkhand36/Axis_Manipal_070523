//package org.Manipal.pageObjects;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class MenuPage {
//
//	WebDriver driver;
//
//	public MenuPage(WebDriver driver) {// assign the value to variable on line 11 with the value that i will give from
//										// test case
//		// TODO Auto-generated constructor stub
//		this.driver = driver;
//		PageFactory.initElements(driver, this);// initialise the elements
//	}
//	
//	@FindBy(id = "nav-hamburger-menu")
//	public WebElement hamburgerMenu;
//
//	@FindBy(xpath = "//*[text()='Mobiles, Computers']")
//	public WebElement MobileComputerMenLbl;
//
//	@FindBy(xpath = "//*[text()='All Mobile Phones']")
//	public WebElement allMobileLbl;
//
//	public void menuNavigation() {
//		hamburgerMenu.click();
//		MobileComputerMenLbl.click();
//		allMobileLbl.click();
//	}
//
//}
//
//	