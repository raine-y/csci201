import java.util.ArrayList;

public class Deck {

    public static ArrayList<String> generateDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String joker = "Joker";
        ArrayList<String> deck = new ArrayList<>();
        int sLength = 4;
        int rLength = 13;
        for (int s = 0; s < sLength; s++) { // s: suit
            for (int r = 0; r < rLength; r++) { // r: rank
                String rank = (String) ranks[r];
                String suit = (String) suits[s];
                String card = rank + " of " + suit;
                deck.add(card);
            }
        }
        deck.add(joker);
        deck.add(joker);
        return deck;
    }
}