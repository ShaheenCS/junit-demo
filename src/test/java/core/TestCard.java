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
		Suit s = c.Suit("Spades");
		assertEquals(s, Suit.SPADES);
	}
	
}