package DragAndDrop;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class DragAndDrop1 {
	
	  WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  
		 
		  driver.switchTo().frame(0);
		  
		  Actions sd=new Actions(driver);
			 sd.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
			 
	     
		
	  }
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\koorosh\\eclipse-workspace2\\Verizon1_Home\\DriversSP\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("https://jqueryui.com/droppable/");
		
		 driver.manage().window().maximize();
		 
		 
	  }

	  @AfterClass
	  public void afterClass() throws IOException {
		  
		  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(shots, new File("D:\\scren\\pass\\screenshot2.png"));
		  
		  
		  
	  }

	}
