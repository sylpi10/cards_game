package test.cards.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cards.data.Value;

class TestValue {

	@Test
	void testValue() {
		Value val = Value.ACE;
		int cmp = val.compareTo(Value.JACK);
		System.out.println("ace compareto jack : " + cmp);
		int o = val.ordinal();
		System.out.println("ordinal : " + o);	
		
	}
	
	@Test
	void aceHigher() {
		for (Value val : Value.values()) {
			int newOrdinal = (val.ordinal() + 12) %13;
			System.out.println(val + " : " + newOrdinal);
		}
	}
	
}	

