package VerizonTNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;

public class Verizon_TestNG {

  
  WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement a=driver.findElement(By.xpath("//span[contains(@class,'tab-label')][contains(text(),'Flights')]"));
	  a.click();
	 WebElement as=driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
	 as.sendKeys("chicago");
	 Thread.sleep(2000);
	 WebElement ab=driver.findElement(By.xpath("//a[@id='aria-option-1']//span[contains(text(),'Illinois, United States')]"));
	 ab.click();
	 Thread.sleep(2000);
	 WebElement aaa=driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
	 aaa.click();
	 
	 
	 WebElement aa=driver.findElement(By.xpath("//div[contains(@class,'datepicker-cal')]//div[2]//table[1]//tbody[1]//tr[4]//td[6]//button[1]"));
	 aa.click();
	 WebElement aab=driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
	 aab.click();
	 
	 Thread.sleep(2000);
	 WebElement b=driver.findElement(By.xpath("//div[contains(@class,'col gcw-date-field')]//div[3]//table[1]//tbody[1]//tr[1]//td[7]//button[1]"));
	 b.click();
	 
	 WebElement bb=driver.findElement(By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[contains(@class,'btn-primary btn-action gcw-submit')]"));
	 bb.click();
	 
	 
	
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Verizon1_Home\\DriversSP\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("https://www.expedia.com");
	
	 driver.manage().window().maximize();
	 
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
