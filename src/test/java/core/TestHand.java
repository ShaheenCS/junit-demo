package core;

import junit.framework.TestCase;

public class TestHand extends TestCase {
	
	public void testNoCards() {
  
		Hand h = new Hand();
		assertEquals(false, h.isFull());
	}
	
	public void testAddHand() {
		  
		Hand h = new Hand();
		Card c = new Card("AS");
		assertTrue(h.addHand(c));
	}
	
	public void testFullHouse(){
		Hand fullHouse = new Hand("3D 3H 3S 2H 2S");
		assertTrue(fullHouse.isFullHouse());
	}
	
}

