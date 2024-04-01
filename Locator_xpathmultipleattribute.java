package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Locator_xpathmultipleattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?ec=302&startURL=%2F00658000009BbTCAA0");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"input r4 wide mb16 mt8 username\"]  [@type=\"email\"]")).sendKeys("vajra739@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"input r4 wide mb16 mt8 password\"]  [@id=\"password\"]")).sendKeys("Sudha@12345");
		driver.findElement(By.xpath("//*[@class=\"button r4 wide primary\"]  [@type=\"submit\"]")).click();
		//in login page it should shows error massage like please check the user name and password
		System.out.println("Scrpit Sucess");

	}

}
