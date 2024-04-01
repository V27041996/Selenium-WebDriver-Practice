package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_linktext {

	public static void main(String[] args) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.selenium.dev/");
	  Thread.sleep(10000);
	  driver.findElement(By.linkText("Downloads")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.linkText("Documentation")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.linkText("Projects")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.linkText("Support")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.linkText("Blog")).click();
	  Thread.sleep(10000);
	  System.out.println("Script success");
	

}
}
