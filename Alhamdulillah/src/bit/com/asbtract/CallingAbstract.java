package bit.com.asbtract;

import org.junit.Test;

public class CallingAbstract extends AbstractMethod{

	Anil a;

	@Test
	public void move() {
		a= new Anil();
		System.out.println(a.getHands());
		
		a.setHands(123);
		System.out.println(a.setHands(123));
		
		
	}
	
	

}
