import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpLes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://facebook.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("Prathap");  //here we are finding the textbox with its respective id(locator), and passinf the arguments in it
driver.findElement(By.name("pass")).sendKeys("This is my pasword");
   driver.findElement(By.linkText("Forgotten password?")).click();
   }

}
