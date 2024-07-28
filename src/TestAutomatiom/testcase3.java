package TestAutomatiom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testcase3 {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		testexaample object = new testexaample();
		
		Boolean output = object.isvalid("Abc123");
		
		assertEquals(true, output);
	}

}
