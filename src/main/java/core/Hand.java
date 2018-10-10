package core;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList<Card> cards;
	private String temp;
	
	public Hand(String myHand){
		cards = new ArrayList<Card>();
		String[] myCards = myHand.split(" ");
		this.temp = myCards[0];
		for(int i = 1; i < 6; i++){
			cards.add(new Card(myCards[i]));
		}
	}
	
	public ArrayList<Card> getCard(){
		return cards;
	}
	

	public boolean addCard(Card cd){
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
	
	public boolean fullHouse(){
		return true;
	}
}
