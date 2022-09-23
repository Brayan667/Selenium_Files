package seleniumexamples;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Assignment_7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
    	Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("//ul//li[3]")).click();
		driver.findElement(By.linkText("Apply")).click();
//		driver.findElement(By.xpath)
		driver.findElement(By.xpath("//form//div//div//div//div[2]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//form//input")).sendKeys("2022-09-22");
//		driver.findElement(By.xpath("//form//div[2]//div[2]//div[2]")).sendKeys("2022-09-25");
		driver.findElement(By.xpath("//textarea")).sendKeys("Feeling sick. Not well");
		driver.findElement(By.xpath("//form//div[5]//button")).click();
	}
		   

	}

