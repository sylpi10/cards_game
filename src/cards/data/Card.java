package cards.data;

import java.util.Objects;

public class Card {
	
	private final Value value;
	private final Family family;
	
	public Card(Value value, Family family) {
		super();
		this.value = Objects.requireNonNull(value);
		this.family = Objects.requireNonNull(family);
	}

	public Value getValue() {
		return value;
	}

	public Family getFamily() {
		return family;
	} 

	
	@Override
	public String toString() {
		return  value + " " + family;
	}
	
	
}
