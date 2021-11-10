import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceExmp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("Prathap");  // It will shows error..bcz compound classname not allowed
	driver.findElement(By.id("username")).sendKeys("Shwetha");
	driver.findElement(By.name("pw")).sendKeys("Prathap");
	driver.findElement(By.xpath("//*[@id='Login']")).click();  // Here we are using Xpath to identify the object and click on it.
	driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).click();  //By using css
	
	}

}


/* Consider a html tag from webpage
<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;">

here,
input - tagname
Attribute = class
Value = input r4 wide mb16 mt8 username

Syntax :- //tagname[@attribute='value']

Now consider from above :-
//input[@type='email']

*/

/*Syntax for css :-
  tagname[attribute='value']
 from avbove htmal,

input[type='email']

*/