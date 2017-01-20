import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Test 
{
	public static void main(String[] args)
	{		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id='day']")).sendKeys("6");
		driver.findElement(By.xpath("//*[@id='month']")).sendKeys("Feb");
		
		//Select select = new Select (driver.findElement(By.xpath("//*[@id='day']")));
		//select.selectByVisibleText("1");
		driver.close();
		
	   // driver.window.maximize();
	   // driver.getWindowHandle()
	// driver.windowhandle
	// welcome to new user and its uses.
	// Welcome to new messages and randamization;
	 
	   
	  
	  
	}
}