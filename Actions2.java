package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Actions2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions Sudha = new Actions(driver);
		//WebElement rightclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//Sudha.contextClick(rightclick).perform();
		WebElement doubleclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Sudha.doubleClick(doubleclick).perform();
		System.out.println("Script sucess");
	}

}
