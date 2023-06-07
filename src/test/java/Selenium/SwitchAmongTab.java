package Selenium;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchAmongTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Load URL
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();					
        driver.get("http://www.google.com/");
        
        driver.findElement(By.linkText("Gmail")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
       
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        
        Set<String> windowsID = driver.getWindowHandles();
        
        Iterator<String> it = windowsID.iterator();
        
        while(it.hasNext()) 
        {
        	
        	String child = it.next();
        	if (!parent.equals(child));
        	{
        		driver.switchTo.window(child);
        	}
        }
                 
        driver.findElement(By.xpath("//*[@data-action='sign in]")).click();
        driver.switchTo().window(parent);
        
	}
}