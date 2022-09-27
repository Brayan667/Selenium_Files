package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Css {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Admin");
    	Thread.sleep(500);
		driver.findElement(By.cssSelector("input[name=password")).sendKeys("admin123");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();

	}

}
