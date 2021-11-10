import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//by casting we are invoking our driver to execute javascript
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;   
		js.executeScript("window.scrollBy(0,500)");

		//window.scrollBy(0,500) ==> It is javascript to scroll in wondows
		//To scroll inside a table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=4000");
	}

}
