package seleniumexamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(500);
		driver.findElement(By.name("username")).sendKeys("Admin");
    	Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

}
