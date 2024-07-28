package TestAutomatiom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testcase1 {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		testexaample object = new testexaample();
		
		int output = object.square(4);
		
		assertEquals(16, output);
		
	}

}
