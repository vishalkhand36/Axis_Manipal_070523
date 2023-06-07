package Selenium;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;		

public class DropAndDrapAction {				


    public static void main(String[] args)				
    {	
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();					
        driver.get("http://demo.guru99.com/test/drag_drop.html");					
         			
         		
        //Using Action class for drag and drop.	
         
        Actions act=new Actions(driver);					

	    //Dragged and dropped.		
         
        act.dragAndDrop(driver.findElement(By.id("fourth")), driver.findElement(By.id("amt8"))).build().perform();
        
        System.out.println("Done Mouse hover on 'value' from Menu");
        
        
	}		
}
		