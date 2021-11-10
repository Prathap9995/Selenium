import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	System.out.println(	driver.findElements(By.cssSelector(".table-display td:nth-child(3)")).size());
	System.out.println(	driver.findElements(By.cssSelector(".table-display th")).size());
	System.out.println(	driver.findElements(By.cssSelector(".table-display  tr:nth-child(3)")).get(0).getText());

	}

}
