

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Demo1 {
		public static void main(String[] args) {
			/* classname = X;
			 * X x = new X(); ==>creating an object for perticular class.
			 */
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathap\\Downloads\\Selenium\\chromedriver.exe");    //invoke.exe file first
	  WebDriver driver = new ChromeDriver();   // Creating an object for chrome browser //we will strictly implements method of webdriver
	     driver.get("http://google.com") ;   
	     System.out.println(driver.getTitle());   //validate if our page title is correct
	     System.out.println(driver.getCurrentUrl());   //Validate if we were on correct page
	  //   System.out.println(driver.getPageSource());   ---> to get page source

		driver.navigate().to("http://udemy.com");	//to go to udemy page or navigate to another page inside google
        driver.navigate().back();                   //To come to google page    
        driver.navigate().forward();                //To move forward
        driver.close();                             //It close current browser only
     // driver.quit()                               // To close all the browser opened by selenium script
			/* Webdriver is an interfaces,it provides all the methodds for automation.*/

		}





}
	//To check whether we are on same url or not....incase of hacking time or to check redirected to another page or not. to prevent from thta we are using it.
	// --->getCurrentUrl()