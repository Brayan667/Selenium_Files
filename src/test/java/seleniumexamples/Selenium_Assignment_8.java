package seleniumexamples;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

//import org.testng.asserts.SoftAssert;


public class Selenium_Assignment_8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.findElement(By.xpath("//div[4]/p")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		String url = driver.getCurrentUrl();
//		Selenium_Assignment_8 softAssert = new Selenium_Assignment_8();
//		softAssert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		System.out.println("After assertion");
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("After assertion");
	}

}
