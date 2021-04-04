import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlackjackHand {
	
	private static Map<Rank, Integer> CARD_VALUES = createCardValues();
	
	private final int MAX_VALUE = 21;
	
	private List<Card> cards = new ArrayList<Card>();
	
	public BlackjackHand(Card c1, Card c2) {
		cards.add(c1);
		cards.add(c2);
	}
	
	public void addCard(Card card) {
		if (getValue() < MAX_VALUE) {
		cards.add(card);
		}
		
	}
	
	public static Map<Rank, Integer> getCardValues(){
		return createCardValues();
		
	}
	
	public List<Card> getCards(){
		List<Card> copy = cards;
		return copy;
		
	}
	
	public int getValue() {
		
	}

	public int size() {
		return cards.size();
		
	}
	
	@Override
	public String toString() {
		
	}
	
	public static Map<Rank, Integer> createCardValues(){
		Map<Rank, Integer> vals = new HashMap<Rank, Integer>();
		vals.put(Rank.TWO, Integer.valueOf(2));
		vals.put(Rank.THREE, Integer.valueOf(3));
		vals.put(Rank.FOUR, Integer.valueOf(4));
		vals.put(Rank.FIVE, Integer.valueOf(5));
		vals.put(Rank.SIX, Integer.valueOf(6));
		vals.put(Rank.SEVEN, Integer.valueOf(7));
		vals.put(Rank.EIGHT, Integer.valueOf(8));
		vals.put(Rank.NINE, Integer.valueOf(9));
		vals.put(Rank.TEN, Integer.valueOf(10));
		vals.put(Rank.JACK, Integer.valueOf(10));
		vals.put(Rank.QUEEN, Integer.valueOf(10));
		vals.put(Rank.KING, Integer.valueOf(10));
		vals.put(Rank.ACE, Integer.valueOf(11));
		return vals;
	}
}
