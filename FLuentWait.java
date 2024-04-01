package VINDVG1.Vinay27;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FLuentWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-header-1\"]/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is custom message..!! ")
				.ignoring(NoSuchElementException.class);
	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//*[@id=\"menu-header-1\"]/li[1]/div/div/section/div/div/div/section/div/div[1]/div/div[3]/div/div/a/span/span"))).click();
	System.out.println("Success...!");

	}

}
