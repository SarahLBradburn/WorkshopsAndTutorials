import java.util.Random;

/**
 * This is a class, used to represent an object.
 *
 * Created by sarah on 7/14/2016.
 */
public class Card implements Comparable {

    //TODO: Declare two variables, value and suit
    private int value;
    private Suits suit;

    //TODO: Create a constructor for card
    public Card(Suits suit, int value) {
        this.value = value;
        this.suit = suit;
    }

    //TODO: Create a function that returns the value of the card (call it getValue)
    public int getValue() {
        return this.value;
    }

    public Suits getSuit() {
        return this.suit;
    }

    public int compareTo(Object o) {
        return value - ((Card) o).getValue();

    }
}
