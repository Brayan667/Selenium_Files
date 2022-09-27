package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest_1 {
	private static WebDriver driver  = null;
  @Test
  public void URL_Validation() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String title = driver. getTitle();
		String expected_title = "OrangeHRM";
		Assert.assertEquals(expected_title, title);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  

  
  
  @Test
  public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.linkText("Logout")).click();
		String title1 = driver. getTitle();
		String expected_title1 = "OrangeHRM";
		Assert.assertEquals(expected_title1, title1);;
		
		
  }
}
