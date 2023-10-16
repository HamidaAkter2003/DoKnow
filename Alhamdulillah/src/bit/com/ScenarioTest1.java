package bit.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScenarioTest1 {
	
	WebDriver dr;
	DataOnly1 d= new DataOnly1();
	public ScenarioTest1(WebDriver dr) {
	this.dr= dr;
	}
	
	
	public void signInHomeDepot() throws InterruptedException {
		SharedTest2 sha= new SharedTest2(dr);
	
		sha.goToHomeDepot("https://www.homedepot.com/");
		Thread.sleep(5000);
		sha.verifyLogo(By.xpath(d.HomeDepotLogo));
		Thread.sleep(10000);
		//sha.checkMyCartIsDisplayed(d.myCartText);
		sha.ClickOnMyAccount("#headerMyAccount > div:nth-child(1) > div");
		sha.checkMyCartIsDisplayed(d.myCartText1);
		Thread.sleep(5000);
		
	}

}

/*1)Open FirefoxBrowser
 * 2)Naviget to Homedepot
 * 3)Verify HomeDepot logo
 * 4)check my cart text is displayed
 * 
 * 
 * 
 */





