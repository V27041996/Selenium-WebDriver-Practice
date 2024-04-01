package VINDVG1.Vinay27;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class KeyboardAc1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions Vinay = new Actions(driver);
		
	    driver.findElement(By.id("userName")).sendKeys("Vinay Kumar");
		
		driver.findElement(By.id("userEmail")).sendKeys("salkattevinay@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Davangare-Bangalore-Mysore");
		
		Vinay.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Vinay.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Vinay.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("permanentAddress"));
		Vinay.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		System.out.println("Script Sucess");

	}

}
