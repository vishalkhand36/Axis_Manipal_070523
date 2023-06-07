package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		// Open source demo web page
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		// class called select that we use for DropDowns
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		
		// selctByValue using
		drpCountry.selectByValue("ANGOLA");
		
		// using thread we take 5 second or user choice delay the next step
		Thread.sleep(5000);
		
		// Using text through
		drpCountry.selectByVisibleText("ANTARCTICA");
		
		// using indexing but sometimes value change so that is advantage of index
		drpCountry.selectByIndex(6);
		
		
		
    }
}