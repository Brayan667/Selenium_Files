package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Assignment_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id]")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Brayan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Saldanha");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("brayanyt986@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("brayanyt986@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Admin3");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Admin3");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("11");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Feb");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@value='2']")).click();
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();

	}

}
