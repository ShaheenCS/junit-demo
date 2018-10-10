package core;

import junit.framework.TestCase;

/*
 * @Autor: Shaheen
 */
public class TestCard extends TestCase {
	
	
	public void testName() {
		Card c = new Card("3D");
		assertEquals("3D", c.getName());
	}
	
	public void testSuit() {
		Card c = new Card();
		Suit s = c.makeSuit("Spades");
		assertEquals(s, Suit.SPADES);
	}
	
	public void testRank() {
		Card c = new Card();
		Rank r = c.makeRank("Eight");
		assertEquals(r, Rank.EIGHT);
	}
	
	public void testConvertCard() {
		Card c = new Card();
		boolean converted = c.convertCard("ThreeDiamonds");
		assertEquals(converted, true);
	}
}