package Twitter;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Twitter_TNG {
	 
	  WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  
		  WebElement a=driver.findElement(By.xpath("//input[@name='name']"));
		  	a.sendKeys("koorosh");
		  
		 WebElement as=driver.findElement(By.xpath("//input[@name='phone_number']"));
		 as.sendKeys("7035054337");
		 
		 Thread.sleep(2000);
		 WebElement ab=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1u4rsef r-1luj3t9 r-wgabs5 r-1jkafct r-1yadl64 r-16xksha r-zso239 r-utggzx']//select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-hkyrab r-1loqt21 r-1b6yd1w r-crgep1 r-1ny4l3l r-t60dpp r-1inuy60 r-n072k1 r-vmopo1 r-9qu9m4']"));
		Select dropdown=new Select(ab);
		dropdown.selectByVisibleText("February");
		
		 /*ab.click();
		 
		 Thread.sleep(2000);
		 WebElement aaa=driver.findElement(By.xpath("//option[contains(text(),'September')]"));
		 aaa.click();*/
		 
		 Thread.sleep(2000);
		 WebElement aa=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1u4rsef r-1luj3t9 r-wgabs5 r-1jkafct r-1yadl64 r-16y2uox r-zso239 r-utggzx']//select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-hkyrab r-1loqt21 r-1b6yd1w r-crgep1 r-1ny4l3l r-t60dpp r-1inuy60 r-n072k1 r-vmopo1 r-9qu9m4']"));
		 aa.click();
		 Thread.sleep(4000);
		 
		 WebElement aab=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/div[2]/select[1]/option[24]"));
		 aab.click();
		 
		 Thread.sleep(4000);
		 WebElement b=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1u4rsef r-1luj3t9 r-wgabs5 r-1jkafct r-1yadl64 r-16y2uox r-utggzx']"));
		 b.click();
		 
		 WebElement bb=driver.findElement(By.xpath("//option[contains(text(),'1971')]"));
		 bb.click();
		 
		 WebElement bbb=driver.findElement(By.xpath("//span[contains(text(),'This will not be shown publicly. Confirm your own')]"));
		 
		
		 boolean displd=driver.findElement(By.xpath("//span[contains(text(),'This will not be shown publicly. Confirm your own')]")).isDisplayed();
	     System.out.println(displd);
	     
	    String displd1=driver.findElement(By.xpath("//span[contains(text(),'This will not be shown publicly. Confirm your own')]")).getText();
	     System.out.println(displd1);
	     
	     
		
	  }
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Verizon1_Home\\DriversSP\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://twitter.com/i/flow/signup");
		
		 driver.manage().window().maximize();
		 
	  }

	  @AfterClass
	  public void afterClass() throws IOException {
		  
		  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(shots, new File("D:\\scren\\pass\\screenshot1.png"));
		  
		  
		  
	  }

	}
