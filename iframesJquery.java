package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class iframesJquery {

	public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://jqueryui.com/slider/");
	   driver.manage().window().maximize();
	   Actions Sudha = new Actions(driver);
	   WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	   driver.switchTo().frame(iframe);
	   WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
	   Sudha.dragAndDropBy(slider,400,0).perform();
	   slider.click();
	   System.out.println("slider moves sucess");

	}

}
