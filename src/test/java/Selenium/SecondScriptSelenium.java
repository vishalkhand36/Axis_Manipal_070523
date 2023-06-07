package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SecondScriptSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("pass")).sendKeys("demo");
		driver.findElement(By.name("snk")).click();

	}

}
