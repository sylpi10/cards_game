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

	@Override
	public int hashCode() {
		
		return Objects.hash(value, family);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return this.value == other.value && this.family.equals(other.family);
	}
	
	
	
}
