package TestAutomatiom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testcase4 {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		testexaample object = new testexaample();
		
		Boolean output = object.notnullString("");
		
		assertEquals(true, output);
	}
		
		
	}
                                                                           