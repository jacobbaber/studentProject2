import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		for (Suit suitVal : Suit.values()) {
			for (Rank rankVal : Rank.values()) {
				cards.add(new Card(rankVal,suitVal));
			}
			
		}
		
	}
	
	public Card draw() {
		if (cards.isEmpty() == true) {
			return null;
		}
		else {
			 Card drawnCard = cards.get(0);
			 cards.remove(0);
			 return drawnCard;
			
		}
		
	}

	public List<Card> draw(int count){
		
		List<Card> drawnCards = new ArrayList<Card>();
		
		if (count > cards.size()) {
			int size = cards.size();
			for (int i = 0; i < size; ++i) {
				drawnCards.add(draw());
			}
			return drawnCards;
		}
		if (count < 0) {
			return drawnCards;
		}
		else {
			for (int i = 0; i < count; ++i) {
				drawnCards.add(draw());
			}
		}
		return drawnCards;
		
	
		
	}
	
	public void shuffle() {
		
	}
	
	public int size() {
		return cards.size();
		
	}
	
	@Override
	public String toString() {
		
		if (cards.isEmpty() == true) {
			return "[]";
		}
		else {
		String deck = "[";
		for (Card card : cards) {
			deck = deck + card.toString() + ", ";
			
		}
		deck = deck.substring(0, deck.length() - 2);
		deck = deck + "]";
		
		return deck;
		}
		
	}
}
