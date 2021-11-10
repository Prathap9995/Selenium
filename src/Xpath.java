  import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Prathap");
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Shwetha");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
         driver.close();
	}

}


//Syntax :- //tagname[@attribute="value"]

/* Using regular expression :-   consider a scenario when we have a single attribute in html tag and that is also varies then by using regular expression we can achieve the locator.

ex :- <input name = "username123">

Syntax :- //tagname[contains(@attribute, 'value')]

//input[contains(@name, 'username')]
*/