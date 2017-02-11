import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	private static final Random random = new Random();
	
	private final List<Card> cards = new ArrayList<>();
	private int dealtIndex = 0;
	
	public Deck(){
		for(int i = 1; i<= 13; i++){
			for(Suit suit : Suit.values()){
				cards.add(new Card(i, suit));
			}
		}
	}
	
	public void shuffle() {
		for(int i = 0; i<cards.size() - 1; i++){
			int j = random.nextInt(cards.size() - i) + i;
		}
	}
	
}