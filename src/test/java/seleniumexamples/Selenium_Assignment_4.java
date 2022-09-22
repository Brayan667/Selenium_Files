package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");//method which tells if we want
		// to use other browser and all.
		WebDriver driver = new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    	Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//driver.findElement(By.name("login")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button")).click();
	}
		// TODO Auto-generated method stub


}
