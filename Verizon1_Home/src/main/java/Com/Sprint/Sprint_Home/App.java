package Com.Sprint.Sprint_Home;



import java.io.IOException;

import org.openqa.selenium.remote.ScreenshotException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CommonSP.BrowsersSP;

public class App extends BrowsersSP implements ITestListener 
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshots("C:\\Users\\koorosh\\eclipse-workspace2\\Sprint_Home\\screenshots\\PassSP\\PassSP");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			screenshots("C:\\Users\\koorosh\\eclipse-workspace2\\Sprint_Home\\screenshots\\FailedSP\\FailedSP");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
    
}