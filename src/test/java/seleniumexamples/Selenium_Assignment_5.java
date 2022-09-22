package seleniumexamples;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Assignment_5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	    String obj = driver.findElement(By.xpath("//table//tr[3]//td[1]")).getText();
	    System.out.println(obj);
	}
}
