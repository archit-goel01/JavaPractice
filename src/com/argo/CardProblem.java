package com.argo;

import java.util.ArrayList;

public class CardProblem {
	private static ArrayList<Card> mCards;

	public enum Suit {
		SPADES, HEARTS, DIAMONDS, CLUBS;
	}

	public enum Rank {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
	}

	public CardProblem() {
		mCards = new ArrayList<Card>();
	}
	
	public void generateDeck() {
		for (Suit s : Suit.values()) {
	        for (Rank r : Rank.values()) {
	            Card c = new Card(s, r);
	            mCards.add(c);
	        }
	        //Suit.CLUBS;
			System.out.println(Suit.SPADES);
	    }
	}

	public static class Card {

		private Suit mSuit;
		private Rank mRank;

		public Card(Suit suit, Rank rank) {
			this.mSuit = suit;
			this.mRank = rank;
		}

		public Suit getSuit() {
			return mSuit;
		}

		public Rank getRank() {
			return mRank;
		}

	}
	
	public static void main(String args[]) {
		
		CardProblem cp = new CardProblem();
		cp.generateDeck();
		for(Card c : mCards) {
			System.out.println("Suit is : "+c.getSuit());
			System.out.println("Rank is : "+c.getRank());
		}
		
		
	}
}
