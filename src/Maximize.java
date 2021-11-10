import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //Maximizing
		
		//To delete all cookies
		driver.manage().deleteAllCookies();
		//To delete perticular cookie
		driver.manage().deleteCookieNamed("name"); // Here if we provide a seesion key id then it will logout from that page and comeagain to previous page
		
		driver.get("https://google.com");

//To take a screenshot
		//We have to convert webdriver into screenshot object   by casting 
		//After casting our driver to screenshot by using "getScreeshotas" method 
		
	File scst = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//To display in desktop....copying screenshot in local machine
	FileUtils.copyFile(scst, new File("D://Screenshot.png"));  //{here package is not available
	//Sometime it will fail because where c drive is secured and we need to have admin rights...by changing drive we can get result
	//If we give the absolute path in C drive that is working
	

	
	}

}
