import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Seleniumgrid {

	public static void main(String[] args) throws MalformedURLException {
		//Creating class 
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("Chrome");
		dc.setPlatform(Platform.WINDOWS);
	//	dc.setVersion(null);   -->Browser version
		
//	WebDriver driver = new ChromeDriver();  -->Runs in normal or local system
		WebDriver driver = new RemoteWebDriver(new URL("https://localhost:4444/wd/hub"), dc);    
		//Here we have to set the ip address and capabilities
		driver.get("Https://google.com");   //This will open in node chrome browser

	}

}

//To configure selenium grid and node and hub is text book


//We should create a project and import the selenium standalone jar[Server jar]
/*DesiredCapabilities :-
  * Set the properties in which browser and in which platform our testcases should run
  * We have to call class "DesiredCapabilities" whenever we have to run romotely
  * We can set browser version also


*/