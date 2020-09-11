package VerizonTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class Alerts {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
	  
	  WebElement E=driver.findElement(By.id("alertButton"));
	  E.click();
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(2000);
	  WebElement EE=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	  EE.click();
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(2000);
	  WebElement EEE=driver.findElement(By.xpath("//button[@id='promtButton']"));
	  EEE.click();
	  
	  driver.switchTo().alert().sendKeys("kuku");
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
			 
  }
  @BeforeClass
public void beforeClass() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Verizon1_Home\\DriversSP\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("https://demoqa.com/alerts");
	
	 driver.manage().window().maximize();
	 
	 
	 
	  
  }

  @AfterClass
  public void afterClass() {
  }
 
}
