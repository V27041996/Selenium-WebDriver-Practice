package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class MouseHover2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2020/07/automation-testing-demo-websites.html");
		driver.manage().window().maximize();
		Actions Sudha = new Actions(driver);
		WebElement mouse =driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[3]/div/a"));
		Sudha.moveToElement(mouse).perform();
		System.out.println("script sucess");
		
	}

}
