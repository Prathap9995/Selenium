import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//We ca switch the frame in 3 different ways i,e
		// by id
		//by index
		//by Webelement
		
		
		 driver.switchTo().frame(0);  // --> By index
	//	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));  
		//Here we are switching to frame session...as  because frame is not part of the current browser we need to specify to selenium
	//	System.out.println(driver.findElement(By.tagName("iframe")).getSize());  //to get the number of frames present in browser
		
		driver.findElement(By.id("draggable")).click();
		
		//To Drag and drop
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//To comeout from frame
		
		driver.switchTo().defaultContent();

	}

}
