package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ToolTip2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		WebElement V=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(V);
		Actions Sudha = new Actions(driver);
		WebElement S = driver.findElement(By.id("age"));
		Sudha.moveToElement(S).perform();
		WebElement Sv = driver.findElement(By.xpath(""));
		String SR = Sv.getText();
		System.out.println(SR);
		
	}

}
