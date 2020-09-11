package RunSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import CommonSP.BrowsersSP;
import Pages_SP.page1;

public class Search_SP extends BrowsersSP {
  @Test
  public void f() throws InterruptedException {
	 
	  
	  Actions A=new Actions(driver);
	  WebElement B=driver.findElement(By.partialLinkText("Plans"));
	  A.moveToElement(B).perform();
	  Thread.sleep(3000);
	  page1 s=new page1 (driver);
	  Thread.sleep(3000);
	  s.SERCh();
	  Thread.sleep(5000);
	  
	 
  }
}
