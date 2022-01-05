package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Setup.BrowserLaunch;

public class LoginPage extends BrowserLaunch {
	
	public void filllogindetails() {
				
		WebElement Username = driver.findElement(By.name("custom_input"));
		Username.sendKeys("vaibhav.pawde");
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("abc@123");
		
		WebElement LoginBtn = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[6]/td[2]/input"));
		LoginBtn.click();
		
	}

}
