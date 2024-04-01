package TestNgsuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class TestMethods {
WebDriver driver;

@BeforeMethod
public void TestingStarted()
{	
System.out.println("Testing Started");
}

@AfterMethod
public void TestingEnded()
{
System.out.println("Testing Ended");	
}

@Test(priority=1)
public void FirststTest()
{
	System.out.println("1st case passed");
}

@Test(priority=2)
public void SecondTest()
{
	System.out.println("2nd case passed");
}

@Test(priority=3)
public void ThirdTest()
{
	System.out.println("3rf case passed");
}

@Test(priority=4)
public void FourthTest()
{
	System.out.println("4th case passed");
}
}
