package TimesheetPratise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimesheetAuto {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.navigate().to("http://timesheet.aqmtechnologies.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.name("txtUserName"));
		Username.sendKeys("vaibhav.pawde");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("abc@357");
		
		WebElement LoginBtn = driver.findElement(By.id("btnLogin"));
		LoginBtn.click();
		
		WebElement opentab = driver.findElement(By.xpath("//table[@id='ctl00_mnuMain']"));
		int counttab = opentab.findElements(By.tagName("a")).size();
		System.out.println(counttab);
		
		for(int i =0; i < counttab; i++ )
		{
			String ctrlkey = Keys.chord(Keys.CONTROL,Keys.ENTER);
			opentab.findElements(By.tagName("a")).get(i).sendKeys(ctrlkey);
		}
	}

}
