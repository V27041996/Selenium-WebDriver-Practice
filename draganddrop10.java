package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop10 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Actions Sp = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));
		Sp.dragAndDrop(from, to).perform();
		String textTo = to.getText();
		if(textTo.equals("Dropped!")) 
		{
		System.out.println("PASS: Source is dropped to target as expected");
		}
		else
		{
		System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
		

	}

}
