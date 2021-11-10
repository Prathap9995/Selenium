import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUploadAutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {
		//To set the path generic or globally we are setting the path--to configure file present or not
		String downloadPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		//We are setting the property to make path generic
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.ilovepdf.com/jpg_to_pdf");
		driver.findElement(By.id("pickfiles")).click();
		
		//We have call the .exe file from document to call AutoIt
		Runtime.getRuntime().exec("C:\\Users\\Prathap\\Documents\\NewFile.exe");
		//By using explicit wait
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTask")));
		driver.findElement(By.id("processTask")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
		driver.findElement(By.id("pickfiles")).click();

		Thread.sleep(5000);
//Redirecting download path to our project path
		File f=new File(downloadPath+"/converted.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			if(f.delete())
				System.out.println("file deleted");

		}

		}


	}


/*  Download ad install autoIt---  [ Here we to tell our autoIt to take the windows control to fetch the files----->in windows]
 * Go to file-->autoit file-->scit3 --To edit the
 steps we have to follow is :-  
 //Shift focus to the file upload window
 //set path of the file in edit box
 //Click open to upload file
 
 
  
 //To spy window object   ---autoit3
  * ControlFocus:-- To shift the focus
  * ControlSetTest :-  To edit in edit box
  * ContrlClick :- To click
  * After that save the file and compile it
  * 
  */

//Codes to download the files:- use selenium
//To verify file is present : by using file class


//To configure the download folders: -  reroute the download preferance to our project path