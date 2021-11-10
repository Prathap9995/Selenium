import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Actions a = new Actions(driver);
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	}

}
