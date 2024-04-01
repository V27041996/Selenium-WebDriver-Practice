package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ActionClass1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		Actions Wd = new Actions(driver);
		WebElement button=driver.findElement(By.id("yesRadio"));
		Wd.click(button).perform();
		Thread.sleep(4000);
		WebElement bbb=driver.findElement(By.id("impressiveRadio"));
		Wd.click(bbb).perform();
		System.out.println("Script sucess");

	}

}
