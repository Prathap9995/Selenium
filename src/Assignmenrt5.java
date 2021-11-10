import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenrt5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");  //by name or id
		driver.switchTo().frame("frame-middle");
	//	System.out.println(driver.findElement(By.tagName("frameset")).getSize());
      System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
	}

}
