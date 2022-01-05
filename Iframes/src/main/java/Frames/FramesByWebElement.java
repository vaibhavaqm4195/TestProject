package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesByWebElement {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://demoqa.com/frames");
		driver.get("http://demo.guru99.com/test/guru99home/");
		 driver.manage().window().maximize();
//		WebElement iframeElement = driver.findElement(By.id("frame1"));
		WebElement iframeElement = driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(iframeElement);
		driver.findElement(By.xpath("html/body/a/img")).click();
	}

}
