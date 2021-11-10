import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class*='blinkingText']")).click();
	Set<String> windows=	driver.getWindowHandles();   //[parentid,childid]---> here it will check for id's of windows
	Iterator<String> it =windows.iterator();     //to give the acces to get id's from windos
	String parentId=it.next();    //Here by using next() we can get parentId...if we write the same step once again then it will move to next index
	String childId= it.next();
	
	
	driver.switchTo().window(childId);   //Switching to child window
	System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
	
	String EmailId = driver.findElement(By.cssSelector("p.im-para.red")).getText().split(" ")[4].trim();
	driver.switchTo().window(parentId);
	
	driver.findElement(By.cssSelector("input#username")).sendKeys(EmailId);
	
	}

}
