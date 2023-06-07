package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;


public class AlerBoxExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		// Open source demo web page
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		// Alert class for handing the alert
		driver.findElement(By.name("submit")).click();
		
		// Using switch class alert
		Alert obj = driver.switchTo().alert();
		
		obj.accept();
		
		System.out.println(obj.getText());
		
		obj.dismiss();
		
	}
	
}
		