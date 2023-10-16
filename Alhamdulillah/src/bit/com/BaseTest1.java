package bit.com;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest1 {
WebDriver dr;


@Before
public void openBrowser() throws InterruptedException {
	dr= new FirefoxDriver();
	Thread.sleep(5000);
}


@After
public void closeBrowser() {
	dr.quit();
}
 
}
//basetest thayk driver pass hobe 