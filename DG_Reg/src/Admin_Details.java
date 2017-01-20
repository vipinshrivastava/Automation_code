import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Admin_Details {

	
	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chrome\\ChromeSetup.exe");
        //WebDriver driver = new ChromeDriver();              
        //driver.get("http://www.google.com");
      
	WebDriver driver = new FirefoxDriver();
     //driver.navigate().to("http://192.168.1.201:8080/digiproctor/registration");
	//driver.get("192.168.0.202:8080/digiproctor/");
	driver.get("www.gmail.com");
 
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("html/body/div[1]/div[2]/h3/a")).click();
	//driver.findElement(By.xpath("html/body/pre/h3[2]/a"));
	driver.findElement(By.xpath("html/body/section/div/div/form/div/div/div[2]/div/div/div/div[2]/input")).click();
	//driver.findElement(By.xpath(".//*[@id='login']/p/a")).click();
	//driver.findElement(By.xpath("//*[@id='ServiceOfferingMasterBean']/div/div/div[2]/div/div/div/div[2]/input")).click();
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//*[@id='strCustomerName']")).sendKeys("Infobeans");

	driver.findElement(By.xpath("//*[@id='CustomerBean']/div[1]/div[2]/div/div/div/label[1]")).click();
	driver.findElement(By.xpath("//*[@id='strFirstName']")).sendKeys("vinaya");
	driver.findElement(By.xpath("//*[@id='strLastName']")).sendKeys("singh");

	driver.findElement(By.xpath("//*[@id='strUserEmail']")).sendKeys("viny.sharma30@gmail.com");
	driver.findElement(By.id("strUserMobile")).sendKeys("9555180320");
	//Thread.sleep(5000);
	((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	//driver.manage().window().maximize();
	

    driver.findElement(By.id(("strLoginId"))).sendKeys("vinay12345670");
	driver.findElement(By.xpath("//*[@id='strPassword']")).sendKeys("Vip123456@");
	driver.findElement(By.xpath("//*[@id='strConfirmPassword']")).sendKeys("Vip123456@");
    
	driver.findElement(By.xpath("//*[@id='CustomerBean']/div[2]/input[1]")).click();
	driver.quit();
	}
}
