package bit.com;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//Driver swap from BaseTest 

public class SharedTest2 {
	
	WebDriver dr;
	public SharedTest2(WebDriver dr) {
		this.dr= dr;
		
	}
	

	public void goToHomeDepot(String url) {
		dr.get(url);
		
	}
	
	public void verifyLogo(By by) {
		
		boolean d=dr.findElement(by).isDisplayed();
		if (d) {
			
			System.out.println("Logo is diplayed");
		}
		else {
			System.out.println("Logo didn't display");
		}
	}
	
	
	public void ClickOnMyAccount(String text) {
		
		dr.findElement(By.xpath(text)).click();
	}
 public void checkMyCartIsDisplayed(String text){
	 boolean k=dr.findElement(By.xpath(text)).isDisplayed();
	 
	 Assert.assertTrue(k);
	
	 
 }
}
