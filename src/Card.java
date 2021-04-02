
public class Card implements Comparable{
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		
		if (rank == null || suit == null) {
			throw new NullPointerException();
		}
		else {
		this.rank = rank;
		this.suit = suit;
		}
		
	}
	
	public int compareTo(Card card) {
		
		
	}
	
	public boolean equals(Object obj) {
		
	}
	
	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public int hashCode() {
		
	}
	
	@Override
	public String toString() {
		
	}

	
	
	

}
