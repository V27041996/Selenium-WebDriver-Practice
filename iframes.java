package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class iframes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		/*Methods to identify iframes 
		 1)By index Syntax driver.switchTo().frame(0);
		 2)By name or id   driver.switchTo().frame("iframe");
		 3)By WebElement   driver.switchTo().frame("WebElement");*/
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		System.out.println("Script sucess");
	}

}
