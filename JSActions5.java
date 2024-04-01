package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JSActions5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		String src = driver.switchTo().alert().getText();
		System.out.println(src);
		String seee = "Please enter your name";
		if(src.equalsIgnoreCase(seee))
		{
		System.out.println("Pass = Prompt box method passed");	
		}
		else
		{
		System.out.println("Fail = Prompt box method failed");
		}
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Vinay Kumar S P");
		driver.switchTo().alert().accept();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());

	}

}
