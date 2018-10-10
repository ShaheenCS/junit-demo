package core;

import junit.framework.TestCase;

public class TestDeck extends TestCase {
	//test for 52 cards
	public void testFullDeck(){
		Deck deck = new Deck();
		assertEquals(52, deck.cards.size());
	}
}
