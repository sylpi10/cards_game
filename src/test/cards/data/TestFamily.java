package test.cards.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import cards.data.Family;

class TestFamily {

	@Test
	void test() {
		Family family = Family.HEART;
		System.out.println(family);
		System.out.println(Family.values());
		System.out.println(Arrays.toString(Family.values()));
		for (Family fam : Family.values()) {
			System.out.println("---" + fam);
		}
	}

}