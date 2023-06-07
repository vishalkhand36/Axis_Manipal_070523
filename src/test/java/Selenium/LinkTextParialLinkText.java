package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LinkTextParialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\vishal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.calculator.net/calorie-calculator.html\"");
		
		driver.findElement(By.linkText("BMI")).click();
		driver.findElement(By.partialLinkText("Conception")).click();

	}

}
