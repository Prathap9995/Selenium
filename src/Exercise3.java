import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/windows']")).click();
		driver.findElement(By.cssSelector("div#content div a")).click();
	    Set<String> window = driver.getWindowHandles();
	    
	  Iterator<String> it =  window.iterator();
		String PID = it.next();
		String CID = it.next();
		
		driver.switchTo().window(CID);
	System.out.println(	driver.findElement(By.cssSelector("div.example h3")).getText());
	driver.switchTo().window(PID);
	System.out.println(	driver.findElement(By.cssSelector("div.example h3")).getText());
		}
	}


