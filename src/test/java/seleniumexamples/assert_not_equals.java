package seleniumexamples;
 
import org.junit.Assert;
//import org.testng.asserts.SoftAssert;  

public class assert_not_equals {

	public static void main(String[] args) {
		
		
//		        SoftAssert softAssertion= new SoftAssert();
//		        softAssertion.assertEquals("Hello", "Hello1");  
		
		        Assert.assertEquals("Hello", "Hello1");  
		        System.out.println("Execution complete");     
		        
		       // Assert.assertNotEquals("Hello","Hello");
		    }  
		  

	}

