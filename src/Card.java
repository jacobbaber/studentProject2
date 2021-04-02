
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
	@Override
	public int compareTo(Card card) {
		
		int c1 = suit.compareTo(card.getSuit());
		
		if (c1 == 0) {
			int c2 = rank.compareTo(card.getRank());
			return c2;
		}
		
		return c1;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			Card c = (Card) obj;
			Card d = new Card(rank, suit);
			int comparedCard = c.compareTo(d);
			if (comparedCard == 0) {
				return true;
			}
		}
		return false;
		
		
		
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
