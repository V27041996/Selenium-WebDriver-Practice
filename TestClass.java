package TestNgsuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class TestClass {
WebDriver driver;
@BeforeClass
public void Testinitated()
{
System.out.println("Test initated");	
}
@AfterClass
public void TestAborted()
{
System.out.println("Test Aborted");
}

@Test(priority=1)
public void TestA()
{
System.out.println("Case 1 passed");	
}

@Test(priority=2)
public void TestB()
{
System.out.println("Case 2 passed");	
}

@Test(priority=3)
public void Testc()
{
System.out.println("Case 3 passed");	
}
}


