package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebElement;


public class Dragdrop3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions Rcb=new Actions(driver);
		WebElement from=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Rcb.dragAndDrop(from, to).perform();	
		System.out.println("Script sucess");
		
		

	}

}
