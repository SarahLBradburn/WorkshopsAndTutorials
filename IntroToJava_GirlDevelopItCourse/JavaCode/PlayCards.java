/**
 * This is the driver class, meaning that
 * when you push "run" it executes the code within 'main'
 * Created by sarah on 7/17/2016.
 */
public class PlayCards {

    /**
     * This is the indicator that the program will run this section of
     * code.  No code is run unless you put it within main.
     * Don't worry about the String[] args at this point
     * @param args
     */
    public static void main(String[] args) {
        playWar();
    }

    /**
     * A function that will be used to play the game War.
     */
    public static void playWar() {
        Deck myDeck = new Deck();
        myDeck.shuffle();
        Player p1 = new Player(myDeck);
        Player p2 = new Player(myDeck);

        int p1Score = 0;
        int p2Score = 0;

        //TODO: Write a for loop that plays 5 rounds of war
        for(int i = 0; i < 5; i++) {
            Card c1 = p1.playCard();
            Card c2 = p2.playCard();

            if(c1.compareTo(c2) > 0) {
                System.out.println("Player 1 won!");
                p1Score++;
            }
            else if (c1.compareTo(c2) < 0) {
                System.out.println("Player 2 won!");
                p2Score++;
            }
            else{
                System.out.println("It's a tie!");
            }
        }

        System.out.println();
        if(p1Score > p2Score) {
            System.out.println(String.format("Player 1 wins with a score of %d to %d", p1Score, p2Score));
        }
        else if( p1Score < p2Score ){
            System.out.println(String.format("Player 2 wins with a score of %d to %d", p2Score, p1Score));
        }
        else {
            System.out.println("It's a tie, both players got " + p1Score + " points!");
        }
    }

    /**
     * Compares two cards, returns the card with the highest value
     */
    public static Card compareCards(Card c1, Card c2) {
        if(c1.getValue() > c2.getValue()) {
            System.out.println("Card 1 wins");
            return c1;
        }

        else if(c2.getValue() > c1.getValue()) {
            System.out.println("Card 1 wins");
            return c2;
        }

        else {
            System.out.println("It's a tie");
            return null;
        }
    }

}
