package stepdefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practice {
	private static WebDriver driver = null;

		@Given("browser is open and application is in login page")
	
		public void browser_is_open_and_application_is_in_login_page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\brayan1\\chromedriver.exe");
			driver = new ChromeDriver();
			//WebDriver driver = new ChromeDriver();
			driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
			Thread.sleep(500);
		}

		@When("user enters user name and password")
		public void user_enters_user_name_and_password() {
			driver.findElement(By.name("username")).sendKeys("Admin");
	    	//Thread.sleep(500);
			driver.findElement(By.name("password")).sendKeys("admin123");
			//driver.findElement(By.name("login")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		    //throw new io.cucumber.java.PendingException();
		}

		@Then("home page is displayed")
		public void home_page_is_displayed() {
		    // Write code here that turns the phrase above into concrete actions
			String actualresult, expectedresult;
		    expectedresult="PIM";
		    actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
		    SoftAssert soft= new SoftAssert();
		    soft.assertEquals(actualresult, expectedresult);
		    //throw new io.cucumber.java.PendingException();
		}
		    
		@Then("user is logged out")
	    public void user_logged_out() {
		    	driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
				driver.findElement(By.xpath("//ul/li[4]/a[@role='menuitem']")).click();
       }
}


