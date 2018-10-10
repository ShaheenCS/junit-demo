package core;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	String[] suits = {"Spades","Clubs","Hearts","Diamonds"};
	
	ArrayList<Card> myDeck = new ArrayList<Card>();
	
	public void Deck() {
		initializeDeck();
		shuffleDeck();
	}
	
	public void initializeDeck(){
		for(int i=0; i<suits.length; i++){
			for(int j=0; j<ranks.length; j++){
				Card c = new Card(ranks[j]+suits[i]);
				myDeck.add(c);
				
			}
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(myDeck);
	}
	
	public int getDeckSize() {
		return myDeck.size();
	}
}
