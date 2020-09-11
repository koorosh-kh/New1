package Pages_SP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 {

	
		WebDriver driver;
		
@FindBy(xpath ="//a[contains(text(),'Unlimited plans')]")
WebElement SERC;


public page1(WebDriver driver) {
	// TODO Auto-generated constructor stub
 
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void SERCh()  {
	
	SERC.click();

	}

}
