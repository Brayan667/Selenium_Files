package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Assignment_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("Brayan");
		driver.findElement(By.name("lastname")).sendKeys("Saldanha");
		driver.findElement(By.name("reg_email__")).sendKeys("brayanyt986@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("brayanyt986@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin3");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Admin3");
		driver.findElement(By.name("birthday_day")).sendKeys("11");
		driver.findElement(By.name("birthday_month")).sendKeys("Feb");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/label")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();

}
};
//*[@id="u_0_o_ca"]/span[2]
