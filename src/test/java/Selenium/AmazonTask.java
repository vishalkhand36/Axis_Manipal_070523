package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		// 1. Launch amazon.in
		driver.get("https://www.amazon.in/");
		
		
		// 2. Verify that sign in button is visible
		boolean Display =driver.findElement(By.xpath("//a[contains(text(),'Sign in securely')]")).isDisplayed();
		
		System.out.println("Button is Diplayed "+Display);	
		
		
		// 3. Click on hamburger menu icon
//		driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();
		
		driver.findElement(By.id("nav-hamburger-menu")).click();
		
		
		// 4. Click on Mobile,Computer
//		driver.findElement(By.xpath("//*[@data-menu-id='8']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles, Computers')]")).click();

		
		// 5. Click on All Mobile Phones
		
//		String Text = driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-progressive-subnav']/div[@id='nav-subnav']/a[2]/span[1]")).getText();
//		driver.findElement(By.xpath("//a[contains(text(),'All Mobile Phones')]")).click();
		boolean Text = driver.findElement(By.xpath("//a[contains(text(),'All Mobile Phones')]")).isDisplayed();
		
		
		// 6. Verify the header Mobiles & Accessories is visible
         
//		boolean Text = driver.findElement(By.xpath("//a[contains(text(),'All Mobile Phones')]")).isDisplayed();
		System.out.println("Header is Diplayed "+Text);
	}

}
