package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_xpathrelative {

	public static void main(String[] args) {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://recruitmentrrb.in/#/auth/landing");
	  driver.findElement(By.xpath("//*[@id=\"carouselExampleIndicators\"]/div/div[5]/div/div[1]/div/div[3]/nav/div/div/ul/li/a")).click();
	  System.out.println("Script Sucess");
	}

}