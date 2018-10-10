package core;

import junit.framework.TestCase;

public class TestHand extends TestCase {
	
	public void testNoCards() {
  
		Hand h = new Hand();
		assertEquals(true, h.isFull());
	}
	
}

