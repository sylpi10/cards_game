package test.cards.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import cards.data.Card;
import cards.data.Family;
import cards.data.Value;

class TestCard {

	@Test
	void testCreate() {
		Card c = new Card(Value.SEVEN, Family.SPADE);
		System.out.println(c);
		System.out.println(c.getValue());
		System.out.println(c.getFamily());
	}
	
	@Test
	void testCreateAll() {
		
		List<Card> game52 = new ArrayList<Card>();
		
		for (Family f : Family.values()) {
			for (Value v : Value.values()) {
				
				Card c = new Card(v, f);
				game52.add(c);
			}
		}
		System.out.println(game52);
		System.out.println(game52.size());
		
	}

}
