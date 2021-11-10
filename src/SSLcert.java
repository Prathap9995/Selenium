  import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcert {

	public static void main(String[] args) {
		//Here we are creating desired capabilities for general chrome browser
		
	DesiredCapabilities ch =	DesiredCapabilities.chrome();
//	ch.acceptInsecureCerts();      //It will accepts the insecure browser
	ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);  //Another method
	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	
	//Here we are merging our capabilities to the browser which is belongs to us
	ChromeOptions c= new ChromeOptions();
	c.merge(ch);
	//Here we are passing the value
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(c);    //passing value c 
	

	}

}


//Where chromeoptions is used to set local browser settings....but capabilities is to create general profile


//When we get a situation like handling SSl certification we have to use it.....