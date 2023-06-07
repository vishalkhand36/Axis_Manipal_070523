package org.Demo.testcases;
import org.Demo.base.DemoBaseConfigurations;
import org.Demo.pageObjects.DemoHomePage;
import org.Demo.pageObjects.DemoMenuPage;
import org.Demo.pageObjects.VerifyNextPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestCase extends DemoBaseConfigurations {
	
	/* declaration of the Page objects */

	public DemoHomePage homeObj;
	public DemoMenuPage menuObj;
	public VerifyNextPage nextpageObj;
	
	WebDriver driver;
	
	
	/* gave the memory to pageObjects */
	@BeforeClass
	public void initialiSetup() {
		driver = getDriver();
		homeObj = new DemoHomePage(driver);
		menuObj = new DemoMenuPage(driver);
		nextpageObj = new VerifyNextPage(driver);

	}

	/* TestCase */
	@Test
	public void scenario1() {
		homeObj.verifyHomeScreenButtons(); 
		menuObj.menuNavigation();
		nextpageObj.addCartButtonVerification();
   
	}
	
}