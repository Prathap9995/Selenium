import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Prathap");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
//		driver.get("https://www.demoblaze.com/");
//		driver.findElement(By.id("login2"));
//		
//		driver.findElement(By.id("loginusername")).sendKeys("Prathap");
//		driver.findElement(By.id("loginpassword")).sendKeys("Prathap");
//		

	}

	
	
}


//Alert:-
//Simple alert :- it displays some information of the warning
//Prompt alert:-- It asks some inputs from the users
//Confirmation alert :-- It asks permission to do some operation