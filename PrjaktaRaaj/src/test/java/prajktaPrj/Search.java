package prajktaPrj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
	WebDriver driver;
	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.get("https://www.prajaktaraj.in/");}
	
	@Test(priority=2)
	public void search()
	{
		driver.findElement(By.xpath("(//*[@class='modal__toggle-open icon icon-search'])[1]")).click();
		
		WebElement search= driver.findElement(By.id("Search-In-Modal-1"));
		search.	sendKeys("Earrings");
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER).build().perform();
		//WebElement item=driver.findElement(By.id("CardLink--8069786927410"));
		//item.click();
		String url=driver.getCurrentUrl();
		System.out .print(url);
		if(url.contains("Earrings"))
		{
			
			Assert.assertTrue(true);
			
		}
		else
		{
			
			Assert.assertTrue(false);
			
		}
		
		//WebElement addcart=driver.findElement(By.xpath("//button[@name='add']"));
		//addcart.click();
		
		
	}

}
