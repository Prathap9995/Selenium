import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
		 driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("Prathap");
		 driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).sendKeys("123456");
		 driver.findElement(By.xpath("//*[@id=\'username\']")).clear();  //Used to clear the elements which we send in above
		 driver.findElement(By.id("Login")).click();
	System.out.println(driver.findElement(By.id("error")).getText());// To get text from browser in console
		 

	}

}



