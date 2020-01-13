package test.cards.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cards.data.Card;
import cards.data.Family;
import cards.data.Value;

class TestCard {

	List<Card> game52; 

	@BeforeEach
	void testCreateAll() {		
		
		game52 = new ArrayList<Card>();
		
		for (Value v : Value.values()) {
			for (Family f : Family.values()) {
				
				Card c = new Card(v, f);
				game52.add(c);
			}
		}
	}
	
	@Test
	void testCreate() {
		Card c = new Card(Value.SEVEN, Family.SPADE);
		System.out.println(c);
		System.out.println(c.getValue());
		System.out.println(c.getFamily());
	}
	
	@Test
	void testIterable() {
		int size = game52.size();
		System.out.println("there are " + size + " cards");
		for (Card card : game52) {
//			System.out.println("*" + card);
		}
		
		Card clubAce = new Card(Value.ACE, Family.CLUBS);
		for (Card card : game52) {
			if (card.equals(clubAce)) {
				System.out.println(clubAce + " found");
			}
		}
		
		boolean ispresent = game52.contains(clubAce);
		System.out.println(ispresent);
	}
	
	@Test
	void testRemove() {
		Card clubAce = new Card(Value.ACE, Family.CLUBS);
		
		boolean isRemoved;
		isRemoved = game52.remove(clubAce);
		System.out.println(isRemoved);
		System.out.println("there are " + game52.size() + " cards");
		System.out.println(isRemoved);
	}
	
	@Test
	void testRemoveForEach() {
		Card heartKing = new Card(Value.KING, Family.HEART);
		Family fam = Family.HEART;
		
		// concurrentModificationException
//		for (Card card : game52) {
//			if (card.getFamily() == fam) {
//				game52.remove(card);
//			}
//		}
		
		boolean isRemoved;
		isRemoved = game52.removeIf(c -> c.getFamily() == fam);
		System.out.println(fam + " is deleted : " + isRemoved);
		System.out.println(game52.size() + " cards left");
		
		// < java 8
		Value value = Value.FOUR;
		for (Iterator iterator = game52.iterator(); iterator.hasNext();) {
			Card card = (Card) iterator.next();
			if (card.getValue() == value) {
				iterator.remove();
			}
		}
		System.out.println("");
		System.out.println(game52.size() + " cards left");
	}
	

}
