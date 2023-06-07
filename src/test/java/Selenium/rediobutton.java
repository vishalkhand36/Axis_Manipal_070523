package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class rediobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// Open source demo web page
		driver.get("https://www.saucedemo.com/");
		
        // Locate user name by id and we can also used tag name to locate the web page url
//		driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
		
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		
		
		// Locate password by id
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		// Locate login button
		driver.findElement(By.id("login-button")).click();   // By.classNmae(submit-button) also used
		
		// switch to product page
		@SuppressWarnings("unused")
		String currentWindowHandle = driver.getWindowHandle();
		driver.switchTo().window("currentWindowHandle");
		
		// Locate sauce Labs Bolt T-shirt
		driver.findElement(By.partialLinkText("Bolt")).click();
		
		
		
		


	}

}
