package core;

public class Hand {
	
	private Card[] card;
	
	public Hand(){
		card = new Card[5];
	}
	
	public Card[] getCard(){
		return card;
	}
	
	// false if hand is empty 
	public boolean isFull() {
		// empty?
		if(card.length==0){
			return false;
		}
		// valid ID?
		return true; 
	}
}
