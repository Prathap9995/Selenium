package StudyMaterial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HRMLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		
		Set set = new HashSet();
	 String it =  (String) set.iterator().next();
	driver.switchTo().window(it);
	
		
	//driver.get("https://Prathap:Prathap@www.demoblaze.com");
//		Set <String> window = driver.getWindowHandles();
//	Iterator<String> it = window.iterator();
//	String Parent = it.next();
//	String Child = it.next();
	
//	driver.switchTo().window(Parent);
	driver.findElement(By.xpath("//body/div[@id='logInModal']/div[1]/div[1]/div[3]/button[1]")).click();
//		
//		DesiredCapabilities ch = new DesiredCapabilities();
//		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		ChromeOptions op = new ChromeOptions();
//		op.merge(ch);
//		driver.findElement(By.id("loginusername")).sendKeys("Prathap");
//		driver.findElement(By.id("loginpassword")).sendKeys("Prathap");

	}

}
