package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHourConextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Load URL
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();					
        driver.get("http://www.amazon.in/");	
		
                
        Actions obj =new Actions(driver);
        
//        obj.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        
        
        WebElement accountSignIn = driver.findElement(By.id("nav-link-accountList"));
        WebElement yourAccountLabel = driver.findElement(By.xpath("(//*[text()='Your Account'])[2]"));
        
        obj.moveToElement(accountSignIn).contextClick(yourAccountLabel).build().perform();
        
		

		

	}

}

