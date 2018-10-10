package core;

import junit.framework.TestCase;

public class TestHand extends TestCase {
	
	public void testNoCards() {
  
		Hand h = new Hand();
		assertEquals(false, h.isFull());
	}
	
	public void testAddCard() {
		  
		Hand h = new Hand();
		Card c = new Card("AS");
		assertTrue(h.addHand(c));
	}
}

