package VINDVG1.Vinay27;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//CASE 1: Using getAttribute
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips/");
		System.out.println("Tooltip web Page Displayed");

		//Maximise browser window 
		driver.manage().window().maximize();

		// Get element for which we need to find tooltip 
		String ageTextBox = driver.findElement(By.id("toolTipButton")).getText();
		System.out.println(ageTextBox);
		String srce = "Hover me to see";
		if(ageTextBox.equalsIgnoreCase(srce))
		{ 
		System.out.println("Pass : Tooltip matching expected value");
		}
		else
		{ 
		System.out.println("Fail : Tooltip NOT matching expected value"); 
		} 
		// Close the main window 
		//driver.close();
	}

}
