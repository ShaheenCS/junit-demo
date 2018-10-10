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
	
	// could be enum but switch keeps in same class -- cleaner
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
	
	// could use enum in separate file but this more clean
	public Rank makeRank(String str) {
		switch(str) {
		case "Two":
			return Rank.TWO;
		case "Three":
			return Rank.THREE;
		case "Four":
			return Rank.FOUR;
		case "Five":
			return Rank.FIVE;
		case "Six":
			return Rank.SIX;
		case "Seven":
			return Rank.SEVEN;
		case "Eight":
			return Rank.EIGHT;
		case "Nine":
			return Rank.NINE;
		case "Ten":
			return Rank.TEN;
		case "Jack":
			return Rank.JACK;
		case "Queen":
			return Rank.QUEEN;
		case "King":
			return Rank.KING;
		case "Ace":
			return Rank.ACE;
		default:
			return null;
		}
	}
}

