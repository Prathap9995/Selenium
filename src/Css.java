import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Prathap");
		 driver.findElement(By.cssSelector("[id='password']")).sendKeys("Shwetha");
		 driver.findElement(By.cssSelector("input#Login")).click();
		 System.out.println(driver.findElement(By.cssSelector("div.loginError")).getText());
	}

}


//Syntax :- tagname[attribute='value']  -->Always recommended
//          [attribute='value']  --> We can skip tagname
//          tagName#id           --> When we have id in html tag
//          tagName.className    --> When we have class
// We can skip the tagname here

/* Using regular expression :-   consider a scenario when we have a single attribute in html tag and that is also varies then by using regular expression we can achieve the locator.

ex :- <input name = "username123">

Syntax :- tagname[attribute*='value']

From ex :- input[name*='username']

*/