package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeriesOfActions {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.navigate().to("https://mail.aqmtechnologies.com/action/login/aqmtechnologies.com");
		driver.manage().window().maximize();
		WebElement Username = driver.findElement(By.name("custom_input"));
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(Username)
			.click()
			.keyDown(Username, Keys.SHIFT)
			.sendKeys(Username, "hello")
			.keyUp(Username, Keys.SHIFT)
			.doubleClick(Username)
			.contextClick()
			.build();
			
		seriesOfActions.perform() ;
//		driver.close();
		
	}

}
