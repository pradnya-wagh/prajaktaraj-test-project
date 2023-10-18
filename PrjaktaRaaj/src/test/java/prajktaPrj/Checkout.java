package prajktaPrj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkout {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	driver.get("https://www.prajaktaraj.in/");}
	@Test(priority=4)
	public void Checkout() throws InterruptedException
	
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
		
		WebElement checkout=driver.findElement(By.id("checkout"));
		checkout.click();
		
		WebElement custuser=driver.findElement(By.id("CustomerEmail"));
		custuser.sendKeys("pradnyawagh45@gmail.com");
		
		WebElement custpass=driver.findElement(By.id("CustomerPassword"));
		custpass.sendKeys("pradnya@123");
		
		WebElement custbtn=driver.findElement(By.xpath("//button[contains(text(),'Sign ')]"));
		custbtn	.click();
		
		Thread.sleep(10000);
		
		
		WebElement comp=driver.findElement(By.id("TextField2"));
		comp.sendKeys("ABC");
		
		WebElement Add=driver.findElement(By.id("shipping-address1"));
		Add.sendKeys("Pawan nagar");
		
		WebElement cit=driver.findElement(By.id("TextField3"));
		cit.sendKeys("Nashik");
		
		
		
		WebElement con=driver.findElement(By.id("Select1"));
		
		Select st=new Select(con);
		st.selectByValue("MH");
		
		
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//Select drp = new Select(driver.findElement(By.id("shipping-address1")));
		//drp.selectByIndex(2);
		
		
		
		WebElement Mob=driver.findElement(By.id("TextField5"));
		Mob.sendKeys("9876543210");
		
		WebElement pincode=driver.findElement(By.id("TextField4"));
		pincode.sendKeys("422008");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
