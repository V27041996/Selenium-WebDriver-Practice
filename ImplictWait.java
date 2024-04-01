package VINDVG1.Vinay27;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplictWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		//it will search for elements and check for overall browser its global applicable to all elements present in script
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[1]/div/div/section/div/div/div/section/div/div[1]/div/div[3]/div/div/a/span/span"));
		ele.click();	
		System.out.println("Script sucess");
	}

}
