package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_NG_Assignment {
  @Test
  public void facebook_login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Brayan");
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("Saldanha");
		driver.findElement(By.xpath("//div/input[@name='reg_email__']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='reg_email_confirmation__']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='reg_passwd__']")).sendKeys("Admin@123");
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByVisibleText("11");
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select select1=new Select(month);
		select1.selectByVisibleText("Nov");
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select select2=new Select(year);
		select2.selectByVisibleText("2000");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//div/button[@name='websubmit']")).click();
  }
  
  @Test()
  public void excelsheet_import_text() throws IOException {
	  String filePath="//C://brayan1";
	  //String filePath = "";
		String fileName = "Book1s.xlsx";
		String sheetName ="Sheet1"; 
		
		//Create an object of File class to open xlsx file

	    File file = new File(filePath+"\\"+fileName);
	    FileInputStream inputStream = new FileInputStream(file);
	    @SuppressWarnings("resource")
	    Workbook workBook = new XSSFWorkbook(inputStream);
	    Sheet sheet = workBook.getSheet(sheetName);
	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount	);
	    String username, password;
	    Row row = sheet.getRow(1);
	    username=row.getCell(0).getStringCellValue();
	    password =row.getCell(1).getStringCellValue();
	    System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//div/input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//div/button[@name='login']")).click();
  }
  @Test
  public void firefox_browser_opening() {
	  System.setProperty("webdriver.gecko.driver", "C:\\brayan1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
  }
 @Test
 public void tabledetails_fetching() {
	  String str;
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		str= driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
		System.out.println("The extracted data from the Table is : "+str);
  }
 @Test
  public void forgetpass_HRM() {
	  System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div[4]/p")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		String url = driver.getCurrentUrl(); 
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("After assertion");
  }
 @Test
  public void hrmleave_application() {
	  System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test
  public void webtable_fetching() {
		System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:/brayan1/WebTable.html");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]/input")).click();
  }
}

