import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Admin_Copy {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://test.digiproctor.com/digiportal_r1/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='login']/p/a")).click();
		//driver.findElement(By.xpath("//*[@id='register_qb']/div[1]/div[2]/div/div[1]/div/div/div/label[1]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='fname']")).sendKeys("Vipinkgn1");
		driver.findElement(By.xpath("html/body/section/div/div/form/div[1]/div[2]/div/div[4]/div/input")).sendKeys("Shrivastava");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vipin.shrivastava009@yahoo.com");
		driver.findElement(By.xpath("//*[@id='mobile1']")).sendKeys("9907363008");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("sec 54");
		driver.findElement(By.xpath("//*[@id='address2']")).sendKeys("Gurgaon");
		driver.findElement(By.xpath("//*[@id='org_name']")).sendKeys("Logiquebrian");
		driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("Default@123");
		driver.findElement(By.xpath("//*[@id='conf_pwd']")).sendKeys("Default@123");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id='register_qb']/div[1]/div[2]/div/div[20]/div/div/label/div")).click();
		driver.findElement(By.xpath("//*[@id='submit']")).click();

	}
}
