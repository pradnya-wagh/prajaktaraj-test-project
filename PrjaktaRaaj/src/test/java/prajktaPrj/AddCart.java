package prajktaPrj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCart {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.get("https://www.prajaktaraj.in/");}
	
	@Test(priority=3)
	public void AddCart()
	
	{
		
		
		driver.findElement(By.xpath("(//*[@class='modal__toggle-open icon icon-search'])[1]")).click();
		WebElement search= driver.findElement(By.id("Search-In-Modal-1"));
		search.	sendKeys("Earrings");
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER).build().perform();
		WebElement item=driver.findElement(By.id("CardLink--8069786927410"));
		item.click();
		
		WebElement addcart=driver.findElement(By.xpath("//button[@name='add']"));
		addcart.click();
		
		WebElement cartcout=driver.findElement(By.id("Quantity-1"));
		cartcout.getAttribute("data-index");
		//int count=Integer.parseInt(cartcout.getAttribute("data-index"));
		Assert.assertEquals("1", cartcout.getAttribute("data-index"),"Product is not added to cart");
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
	
	

	
	
}
