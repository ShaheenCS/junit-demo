package core;

public class Card implements Comparable<Card>{
	private String  name;
	public Rank rank;
	public Suit suit;
	
	public Card() {}
	
	public Card(String n) {
		name  = n;
	}
		
	public String getName() {
		return name;
	}
	
	// create enum in separate class
	public Suit makeSuit(String str) {
		switch(str) {
		case "S":
			return Suit.SPADES;
		case "C":
			return Suit.CLUBS;
		case "H":
			return Suit.HEARTS;
		case "D":
			return Suit.DIAMONDS;
		default:
			return null;
		}
	}
	
	// create enum in separate class 
	public Rank makeRank(String str) {
		switch(str) {
		case "2":
			return Rank.TWO;
		case "3":
			return Rank.THREE;
		case "4":
			return Rank.FOUR;
		case "5":
			return Rank.FIVE;
		case "6":
			return Rank.SIX;
		case "7":
			return Rank.SEVEN;
		case "8":
			return Rank.EIGHT;
		case "9":
			return Rank.NINE;
		case "10":
			return Rank.TEN;
		case "J":
			return Rank.JACK;
		case "Q":
			return Rank.QUEEN;
		case "K":
			return Rank.KING;
		case "A":
			return Rank.ACE;
		default:
			return null;
		}
	}
	
	public boolean convertCard(String card) {
		String[] parse = card.split("(?=\\p{Upper})");
		Rank r = makeRank(parse[0]);
		Suit s = makeSuit(parse[1]);
		this.name = card;
		this.rank = r;
		this.suit = s;
		return true;
	}

	@Override
	public int compareTo(Card card) {
		// TODO Auto-generated method stub
		Rank cRank = ((Card) card).rank;
		return cRank.getRank() - this.rank.getRank();
	}
	public String toString() {
		return name;
	}
}

