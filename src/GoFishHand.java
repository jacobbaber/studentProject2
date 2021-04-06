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
		if (cardSet.size() == 4) {
			removeCards(card.getRank());
			cardsInHand = cardsInHand - 4;
			books.add(card.getRank());
		}
		
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
		Map<Rank, Set<Card>> copyMap = new HashMap<Rank, Set<Card>>();
		
		for (Rank r : Rank.values()) {
		if (cards.containsKey(r) == true) {
			Set<Card> copy = new HashSet<Card>(cards.get(r));
			copyMap.put(r, copy);
			}
		}
		return copyMap;
		
	}
	
	public Map<Rank, Integer> getRankCounts(){
		
			Map<Rank, Integer> card = new HashMap<Rank, Integer>();
		
				
			
			
		
		
	}
	
	public Set<Card> removeCards(Rank rank){
		
		Set<Card> removedCards = cards.remove(rank);
		if (removedCards == null) {
			Set<Card> emptySet = new HashSet<Card>();
			return emptySet;
		}
		return removedCards;
		
	}
	
	public int size() {
		return cardsInHand;
		
	}
	
	@Override
	public String toString() {
		
	}
}
