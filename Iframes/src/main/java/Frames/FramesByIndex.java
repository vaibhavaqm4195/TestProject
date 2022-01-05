package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesByIndex {
	public static void main(String[] args) {
	    WebDriver driver = new FirefoxDriver();
	    driver.get("http://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    driver.switchTo().frame(1);
	    driver.findElement(By.xpath("html/body/a/img")).click();

	 
	   }
}

