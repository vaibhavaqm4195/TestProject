package DragAndDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
//		driver.navigate().to("https://www.w3schools.com/html/html5_draganddrop.asp");
		 driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		 Actions action = new Actions(driver);
		 
	       driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
	      // Store 'box A' as source element
	      WebElement sourceEle = driver.findElement(By.id("draggable"));
	      // Store 'box B' as source element
	      WebElement targetEle = driver.findElement(By.id("droppable"));
	      // Performs drag and drop action of sourceEle onto the targetEle
	      action.dragAndDrop(sourceEle, targetEle).build().perform();
}
}
