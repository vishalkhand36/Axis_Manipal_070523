//package org.Manipal.testCases;
//import org.Manipal.base.BaseConfigurations;
//import org.Manipal.pageObjects.HomePage;
//import org.Manipal.pageObjects.MenuPage;
//import org.Manipal.pageObjects.MobilePage;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;
////import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class TestCase1 extends BaseConfigurations {
//	
//	// 1. Declare page Objects
//	// 2. we will initialize the page object
//	// 3. implement inheritance concept
//	// 4. Create Test case
//	// 5. Create Web driver reference
//
//	/*
//	 * HomePage homeObj=new HomePage(); 
//	 * MenuPage menuObj=new MenuPage(); MobilePage
//	 * mobileObj=new MobilePage();
//	 */
//
//	/* declaration of the Page objects */
//
//	public HomePage homeObj;
//	public MenuPage menuObj;
//	public MobilePage mobileObj;
//	
//	WebDriver driver;
//	
//	
//	/* gave the memory to pageObjects */
//	@BeforeClass
//	public void initialiSetup() {
//		driver = getDriver();
//		homeObj = new HomePage(driver);
//		menuObj = new MenuPage(driver);
//		mobileObj = new MobilePage(driver);
//
//	}
//
//	/* TestCase */
//	@Test
//	public void scenario1() {
//		homeObj.verifyHomeLaunchSuccess(); 
//		menuObj.menuNavigation();
//		mobileObj.verifyMobileHeader();
//   
//	}
//	
//}