package core;

public class Card implements Comparable<Card>{
	private String  name;
	public Rank rank;
	public Suit suit;
		
	public Card(String n) {
		name  = n;
	}
		
	public String getName() {
		return name;
	}
		
	public Suit makeSuit(String str) {
		switch(str) {
		case "Spades":
			return Suit.SPADES;
		case "Clubs":
			return Suit.CLUBS;
		case "Hearts":
			return Suit.HEARTS;
		case "Diamonds":
			return Suit.DIAMONDS;
		default:
			return null;
		}
	}
}

