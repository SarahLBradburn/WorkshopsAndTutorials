/**
 * Class to represent a card player
 * Created by sarah on 7/23/2016.
 */
public class Player {

    Deck deck;

    public Player(Deck deck) {

        this.deck = deck;
    }

    public Card playCard() {
        return deck.dealCard();
    }
}
