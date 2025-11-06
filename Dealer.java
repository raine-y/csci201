import java.util.ArrayList;
import java.util.Collections;

public class Dealer {
    public static void main(String[] args) {
        ArrayList<String> deck = Deck.generateDeck();
        shuffle(deck);
        dealFive(deck);
    }

    public static void shuffle(ArrayList<String> deck) {
        Collections.shuffle(deck);
    }

    public static void dealFive(ArrayList<String> deck) {
        for (int i = 0; i < 5; i++) { // from the top
            int cardNum = i + 1;
            System.out.println(cardNum + ") " + deck.get(i));
        }
    }
}