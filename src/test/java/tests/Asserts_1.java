
//"<!DOCTYPE suite SYSTEM http://testng.org/testng-1.0.dtd" >"
package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserts_1 {
	private static WebDriver driver = null;
  @Test
  public void URL_Validation() {//to check if expected URL is navigating to the site
	  Asserts_1 obj = new Asserts_1();
	  //obj = null;
	  System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
	  driver =  new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"); 
	  driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	  String title = driver. getTitle();
	  String expected_title = "OrangeHRM";
	  Assert.assertEquals(expected_title, title);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  Assert.assertNotNull(obj);
  }
   
//  @Test
    public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.linkText("Logout")).click();	
}
}

