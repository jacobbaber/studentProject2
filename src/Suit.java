
public enum Suit {
	
	CLUBS("C"), DIAMONDS("D"), HEARTS("H"), SPADES("S");
	
	private String symbol;
	

	Suit(String string) {
		symbol = string;
	}
	
	@Override
	public String toString() {
		return symbol;
		
	}


}
