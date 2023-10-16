package bit.com.assertrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ttru {
	WebDriver dr;
	
	public void abc() throws InterruptedException {
		dr= new FirefoxDriver();
		dr.manage().window().setSize(new Dimension(1400,900));
	Thread.sleep(5000);
	}
	 public void goToTraget() {
		 
		 dr.get("https://www.target.com/");
		 
		 
	 }
	 
	 public void closeBrowser() {
		 dr.quit();
	 }
	 
	 
	 public void logoverify() {
		 
		boolean k= dr.findElement(By.xpath("(//*[local-name()='svg'])[3]")).isDisplayed();
		Assert.assertTrue(k);
		
		System.out.println(k);
		
		
	 }
 public void getTitleVerify() {
		 
		 String actualTitle= dr.getTitle();
		 String expectedTitle="Target : Expect More. Pay Less.";
		Assert.assertEquals(expectedTitle, actualTitle);
	 }
	 
	 public void asserTrue() {
		boolean U= dr.findElement(By.xpath("(//*[local-name()='svg'])[11]")).isDisplayed();
		 Assert.assertTrue(U);
		 System.out.println(" The cart is presesnt in the home page that means the condition is "+ U);
	 }

	 
	 public void ele() {
		
		boolean f=dr.findElement(By.xpath("//div[@data-component-id=\"WEB-306976\"]//picture/img")).isDisplayed();
		Assert.assertFalse(f);
		
	 
	 }

	
}
