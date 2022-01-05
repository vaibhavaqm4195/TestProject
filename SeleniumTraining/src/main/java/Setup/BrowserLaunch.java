package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserLaunch {
	public static WebDriver driver;
	
	
	public void browsersetup() {
		String BrowserName = "Chrome";
		
		switch (BrowserName) {
		case "Firefox":
			//System.setProperty("webdriver.gecko.driver", "D:\\VaibhavPratise\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\VaibhavPratise\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;


		default:
			System.setProperty("webdriver.chrome.driver", "D:\\VaibhavPratise\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		
		driver.navigate().to("https://mail.aqmtechnologies.com/action/login/aqmtechnologies.com");
		driver.manage().window().maximize();
//		driver.close();
			}

}
