package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// Open source demo web page
		driver.get("https://www.saucedemo.com");
		
        // Locate user name by id and we can also used tag name to locate the web page url
//		driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
		
//		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		
		
		// Locate password by id
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		// Locate login button
//		driver.findElement(By.id("login-button")).click();   // By.classNmae(submit-button) also used
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		
    	// switch to product page
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		
		
		
		// Add to cart // tagname.valueClass[attribute=value] and // name(value)
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
	
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-bike-light]")).click();
		
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
	
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		
		// remove product on cart
		driver.findElement(By.name("remove-sauce-labs-backpack")).click();
		
		driver.findElement(By.name("remove-sauce-labs-bike-light")).click();
		
		driver.findElement(By.name("remove-sauce-labs-bolt-t-shirt")).click();
		
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		
		driver.findElement(By.name("remove-sauce-labs-onesie")).click();
		
		driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).click();
		
		
		// Add to cart // tagname.valueClass[attribute=value] and // name(value)
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();
	
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-bike-light]")).click();
		
		driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		
		driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
	
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		
		// Navigate back to cart
		driver.findElement(By.id("shopping_cart_container")).click();
		
		
		// Click Checkout
		driver.findElement(By.id("checkout")).click();
		
		
		//  Enter firstName ,lastName , Checkout
		driver.findElement(By.id("first-name")).sendKeys("Demo"); 
		driver.findElement(By.id("last-name")).sendKeys("Demo_Demo2");  
		driver.findElement(By.id("postal-code")).sendKeys("747474");   
		
		// Click continue
		driver.findElement(By.id("continue")).click();  

//----------------------------------------------------------------------------------------------------------------------------------------------------------		
		// represent
//		System.out.println(driver.findElement(By.xpath("//*[@class='title']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("(//*[@class='summary_info_label'])[1]")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("(//*[@class='summary_info_label'])[2]")).isDisplayed ());
//		System.out.println(driver.findElement(By.xpath("(//*[@class='summary_info_label'])[3]")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//*[@class='summary_info_label_summary_total_label")).isDisplayed ());	
//		driver.findElement(By.id("finish")).click();
//		System.out.println(driver.findElement(By.xpath("//*[@class='complete-header']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//*[@class='complete-text']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.name("back-to-products")).isDisplayed()); 
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------
		
//		System.out.println(driver.findElement(By.xpath("//[text()='Checkout: Overview']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//[text()='QTY']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//[text()='Payment Information']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//[text()='SauceCard #31337']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//[text()='Shipping Information' ]")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//[text()='Free Pony Express Delivery!']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//[text()='Price Total']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//[text()='Item Total: $']")).isDisplayed()); 
//		System.out.println(driver.findElement(By.xpath("//[text()='129.94 ']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//[text()='Tax: $']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//[text()='10.401']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//[text()='Total: $']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//[text()='140.34']")).isDisplayed());
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------		
		
//		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		
//		System.out.println(driver.findElement(By.xpath("//*[text()='Thank you for your order!']")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//*[text()='Your order has been dispatched,and we will rive just as the pony can get there!']")).isDisplayed());
//	    System.out.println(driver.findElement(By.xpath("//button[text()='Back Home']")).isDisplayed());
				 
//----------------------------------------------------------------------------------------------------------------------------------------------------------		

		
		// finished		
				driver.findElement(By.id("finish")).click(); 

	}

}
