package prajktaPrj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class welcome {
	
	static WebDriver driver;
	
	
		@BeforeTest
		public void setup() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.get("https://www.prajaktaraj.in/");
		
		}
		@Test(priority=1)
		public void login()
		{
			
			WebElement signin=driver.findElement(By.xpath("(//a[@href=\"/account/login\"])[2]"));
			signin.click();
		
			WebElement  user_name=driver.findElement(By.id("CustomerEmail"));
			user_name.sendKeys("pradnyawagh45@gmail.com");
			WebElement pass=driver.findElement(By.id("CustomerPassword"));
			pass.sendKeys("pradnya@123");
			WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Sign ')]"));
			btn	.click();
			
		}
		
		
		/*@AfterTest
		
		public void exist()
		{
			
			driver.close();
			
		}*/
		
		
	}


 
 