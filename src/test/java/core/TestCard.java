package core;

import junit.framework.TestCase;

/*
 * @Autor: Shaheen
 */
public class TestCard extends TestCase {
	
	
	public void testNewCardName() {
		Card c = new Card("AS");
		
		assertEquals("AS", c.getName());
	}
	
}