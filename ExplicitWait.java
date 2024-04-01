package VINDVG1.Vinay27;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-header-1\"]/li[1]/div/div/section/div/div/div/section/div/div[1]/div/div[3]/div/div/a/span/span"))).click();	
		System.out.println("Script sucess");

	}

}
