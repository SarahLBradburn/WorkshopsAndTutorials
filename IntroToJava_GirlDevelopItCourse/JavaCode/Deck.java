import java.util.ArrayList;

/**
 * A class to represent a deck of cards
 * Created by sarah on 7/14/2016.
 */
public class Deck {

    private ArrayList<Card> deck;
    private int cardsUsed;

    /**
     * The constructor, used to create an
     * instance of a deck
     */
    public Deck() {
        deck = new ArrayList<Card>();
        cardsUsed = 0;
        createDeck();
    }

    /**
     * Creates a deck of cards
     */
    public void createDeck() {
        for(int i = 1; i < 14; i++) {
            for(Suits s : Suits.values()) {
                deck.add(new Card(s, i));
            }
        }
    }

    /**
     * Shuffles the deck of cards
     */
    public void shuffle() {
        for ( int i = deck.size()-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck.get(i);
            deck.set(i, deck.get(rand));
            deck.set(rand, temp);
        }
        cardsUsed = 0;
    }

    /**
     * Deals a card, keeps track of which card we are on
     * @return
     */
    public Card dealCard() {
        Card c = deck.get(cardsUsed % 52);
        cardsUsed++;
        return c;
    }
}
