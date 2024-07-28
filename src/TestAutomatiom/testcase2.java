package TestAutomatiom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testcase2 {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		testexaample object = new testexaample();
		
		int output = object.sum(20,5);
		
		assertEquals(25, output);
		
	}

}
