package VINDVG1.Vinay27;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;

public class Popup1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert Ab=driver.switchTo().alert();
		Ab.accept();
		System.out.println("Script sucess");
	}

}
