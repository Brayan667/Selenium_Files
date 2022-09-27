package seleniumexamples;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



class Asserts{
	@Test
	public void soft_assert() {
		SoftAssert softAssertion= new SoftAssert();
		System.out.println("softAssert Method Was Started");
		softAssertion.assertTrue(false);
		System.out.println("softAssert Method Was Executed");	
	}
	@Test
	public void hard_assert() {
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
		
	}
}


public class Soft_Assert {

	public static void main(String[] args) {
		
		
		
	
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
		
	}

}
