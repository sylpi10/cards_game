package cards.data;

public enum Value {
	
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	
	@Override
	public String toString() {
		if ((this.ordinal() >= 1) && (this.ordinal() <= 9)) {
			return "" + (this.ordinal() + 1);
		}else
			return this.name().substring(0,1);
	}
}
