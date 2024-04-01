package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSActions4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		String src = driver.switchTo().alert().getText();
		System.out.println(src);
		String sre = "Do you confirm action?";
		if(src.equals(sre))
		{
		System.out.println("Passed");
		}
		else
		{
		System.out.println("failed");
		}
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
	}

}
