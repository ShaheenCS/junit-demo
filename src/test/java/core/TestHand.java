package core;

import junit.framework.TestCase;

public class TestHand extends TestCase {
	
	public void testNoCards() {
		setUp();
		String str = "";
		// we want hand to add hand to player  
		boolean b = r.hand(str);
		assertEquals(b, false);
	}
	
}

