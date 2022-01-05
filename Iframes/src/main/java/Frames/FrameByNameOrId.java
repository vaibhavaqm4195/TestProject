package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameByNameOrId {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("html/body/a/img")).click();
//		driver.quit();

}
}