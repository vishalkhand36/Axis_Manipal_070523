package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FormFillByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.calculator.net/calorie-calculator.html");
		
		driver.findElement(By.linkText("US Units")).click();
		
		
		driver.findElement(By.name("cage")).clear();
		driver.findElement(By.name("cage")).sendKeys("30");
		
		driver.findElement(By.name("cheightfeet")).clear();
		driver.findElement(By.name("cheightfeet")).sendKeys("12");
		
		driver.findElement(By.name("cheightinch")).clear();
		driver.findElement(By.name("cheightinch")).sendKeys("15");
		
		driver.findElement(By.name("cpound")).clear();
		driver.findElement(By.name("cpound")).sendKeys("50");
		
		
//		driver.findElement(By.linkText("Metric Units")).click();
//        
//		
//		driver.findElement(By.id("cage")).clear();
//	   	driver.findElement(By.id("cage")).sendKeys("22");
//	   	
//	  	driver.findElement(By.id("cheightmeter")).clear();
//	   	driver.findElement(By.id("cheightmeter")).sendKeys("180");
//	   	
//	   	driver.findElement(By.id("ckg")).clear();
//	   	driver.findElement(By.id("ckg")).sendKeys("60");

	}

}


