package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
		String Srr = driver.findElement(By.xpath("/html/body/p[4]/label")).getText();
	    System.out.println(Srr);
		String dr = "Your age:";
		if(Srr.equals(dr))
		{
		System.out.println("Pass - Tooltip title matched");
		}
		else
		{	
		System.out.println("Fail - Tooltip title not matched");
		}
		System.out.println("Script sucess");
		driver.quit();
	

	}

}
