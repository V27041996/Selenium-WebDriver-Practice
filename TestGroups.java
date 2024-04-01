package TestNgsuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
public class TestGroups {
@BeforeGroups
public void GroupTestStarted()
{
System.out.println("Groups excution Started");	
}
@AfterGroups
public void GroupTestEnded()
{
System.out.println("Groups excution Ended");	
}

@Test(priority=1)
public void group1()
{
System.out.println("Group case1 passed");	
}

@Test(priority=2)
public void group2()
{
System.out.println("Group case2 passed");	
}

@Test(priority=3)
public void group3()
{
System.out.println("Group case3 passed");	
}
}
