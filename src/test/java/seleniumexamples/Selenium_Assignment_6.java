package seleniumexamples;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Assignment_6 {
	
	WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		  Selenium_Assignment_6 obj = new Selenium_Assignment_6();
		  obj.login();
		  //obj.search("Username");
		  obj.search("Username","userrole");
	}
	
		
	void login()
	{
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();	
	}
	
  void search(String c) {
	  
	  driver.findElement(By.xpath("//form//div[2]//input")).sendKeys("Brayan");
	  driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
//	
	void search(String a, String b) {
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys("Brayan");
		driver.findElement(By.xpath("//form//i")).click();
		driver.findElement(By.xpath("//form//div[2]//div[2]//div[2]")).sendKeys("Admin");
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
	
	
	
	

}
