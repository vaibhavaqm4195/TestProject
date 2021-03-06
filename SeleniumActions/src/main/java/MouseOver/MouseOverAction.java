package MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		 WebElement link_Home = driver.findElement(By.linkText("Home"));
         WebElement td_Home = driver
                 .findElement(By
                 .xpath("//html/body/div"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr/td"
                 + "/table/tbody/tr"));    
          
         Actions builder = new Actions(driver);
         Action mouseOverHome = builder
                 .moveToElement(link_Home)
                 .build();
          
         String bgColor = td_Home.getCssValue("background-color");
         System.out.println("Before hover: " + bgColor);        
         mouseOverHome.perform();        
         bgColor = td_Home.getCssValue("background-color");
         System.out.println("After hover: " + bgColor);

}
}
