package test.cards.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cards.data.Value;

class TestValue {

	@Test
	void test() {
		Value val = Value.THREE;
		int cmp = val.compareTo(Value.JACK);
		System.out.println("ace compareto jack : " + cmp);
		int o = val.ordinal();
		System.out.println("ordinal : " + o);
	}

}
