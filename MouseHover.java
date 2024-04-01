package VINDVG1.Vinay27;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		Actions Sudha = new Actions(driver);
		WebElement mouse = driver.findElement(By.id("toolTipButton"));
		Sudha.moveToElement(mouse).perform();
		Thread.sleep(4000);
		WebElement ili = driver.findElement(By.id("texFieldToolTopContainer"));
		Sudha.moveToElement(ili).perform();
		System.out.println("Script sucess");

	}

}
