import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopupAutoIt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://prathap:prathap@9995the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href*='basic_auth']")).click();

	}

}


//We have to pass url with credential    -->one method of approach
//To upload file by auto It
