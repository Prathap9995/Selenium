import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exercise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input#checkBoxOption1")).isSelected());
	System.out.println(	driver.findElements(By.cssSelector("input[type='checkbox']")).size()) ;
		

	}

}
 