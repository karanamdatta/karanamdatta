package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testutility {
	public  static WebDriver driver;
	public void initiate() throws InterruptedException {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	        driver = new ChromeDriver();
	        driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	 
	
}
