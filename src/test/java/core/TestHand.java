package core;

import junit.framework.TestCase;

public class TestHand extends TestCase {
	
	public void testNoCards() {
  
		Hand h = new Hand("");
		assertEquals(false, h.isFull());
	}
	
	public void testAddCard() {
		  
		Hand h = new Hand("AS");
		Card c = new Card("AS");
		assertTrue(h.addCard(c));
	}
	
	public void testPair(){
		Hand p = new Hand("3D 3H 2C 6S 8D");
		assertTrue(p.pair());
	}
	
	
	// fullhouse contains a pair and triple
	// finish method later when pair and triple established
	public void testFullHouse(){
		Hand fh = new Hand("3D 3H 3S 2H 2S");
		assertTrue(fh.fullHouse());
	}
	
}

