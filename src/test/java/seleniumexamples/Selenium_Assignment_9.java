package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Assignment_9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\brayan1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
}
}
