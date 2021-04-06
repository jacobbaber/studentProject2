import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GoFishHand {
	
	private final int BOOK_SIZE = 4;
	
	private Set<Rank> books = new HashSet<Rank>();

	private Map<Rank, Set<Card>> cards = new HashMap<Rank, Set<Card>>();
	
	private int cardsInHand = 0;
	
	public GoFishHand(Collection<Card> cards){
		if (cards.isEmpty() == true) {
			throw new IllegalArgumentException();
		}
		addCards(cards);
		
	}
	
	public void addCard(Card card) {
		Set<Card> newCardSet = new HashSet<Card>();
		Set<Card> cardSet = cards.getOrDefault(card.getRank(), newCardSet);
		cardSet.add(card);
		cards.put(card.getRank(), cardSet);
		++cardsInHand;
		
	}
	
	public void addCards(Collection<Card> cards) {
		for (Card c : cards) {
			addCard(c);
		}
		
	}
	
	public Set<Rank> getBooks(){
		Set<Rank> copy = new HashSet<Rank>(books);
		return copy;
	}
	
	public Map<Rank, Set<Card>> getCards(){
		Map<Rank, Set<Card>> copy = new HashMap<Rank, Set<Card>>(cards);
		return copy;
		
	}
	
	public Map<Rank, Integer> getRankCounts(){
		
			
		
		
	}
	
	public Set<Card> removeCards(Rank rank){
		
	}
	
	public int size() {
		return cardsInHand;
		
	}
	
	@Override
	public String toString() {
		
	}
}
