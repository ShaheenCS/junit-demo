package core;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards;
	
	public Hand(){
		cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCard(){
		return cards;
	}
	
	public boolean addHand(Card cd){
		cards.add(cd);
		if(isFull())
			return true;
		return false;
	}
	// false if hand is empty 
	public boolean isFull() {
		// empty?
		if(cards.size()==0){
			return false;
		}
		// valid ID?
		return true; 
	}
}
