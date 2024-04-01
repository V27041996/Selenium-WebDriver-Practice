package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestNgXml1 {
	WebDriver driver;
	
	@Test(priority=1,groups="regression")
	public void atest()
	{
		System.out.println("Test case one");
	}
	 
	@Test(priority=2,groups="regression")
	public void btest()
	{
		System.out.println("Test case two");
	}
	
	@Test(priority=3,groups="BuildVerificationtest")
	public void ctest()
	{
		System.out.println("Test case three");
	}

	@Test(priority=4,groups={"regression","BuildVerificationtest"})
	public void dtest()
	{
		System.out.println("Test case four");
	}
	
}
