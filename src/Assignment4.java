import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("div[class='example'] a")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parent);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	}

}
