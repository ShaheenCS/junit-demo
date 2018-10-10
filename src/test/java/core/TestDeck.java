package core;

import junit.framework.TestCase;

public class TestDeck extends TestCase {
	//test for 52 cards
	public void testFullDeck(){
		Deck d = new Deck();
		d.initializeDeck();
		assertEquals(52, d.myDeck.size());
	}
}
