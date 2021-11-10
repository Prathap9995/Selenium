import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rediff.com/");
		 driver.findElement(By.cssSelector("a[title*='Sign in']")).click();  // Usinng CSS regular expressions
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Shwetha");  //Using Xpath 
		 driver.findElement(By.xpath("//input[contains(@id, 'pass')]")).sendKeys("Prathap");  //Using Xpath regular expressions
		 driver.findElement(By.cssSelector("[name='proceed']")).click();
		// driver.close();

	}

}
