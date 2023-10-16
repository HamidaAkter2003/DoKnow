package bit.com;

import org.junit.Test;

public class SmokeTest1 extends BaseTest1{
	ScenarioTest1 s= new ScenarioTest1(dr);
	
	
	@Test
	public void HomeDeTest() throws InterruptedException {
		ScenarioTest1 s= new ScenarioTest1(dr);
		s.signInHomeDepot();
	}
	
	
	

}
