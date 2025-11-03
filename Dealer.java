import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    public static void main(String[] args) {
        ArrayList<String> hand = new ArrayList<>(); // prevents duplicates to mirror 52 + 2 card deck
        for (int i = 0; i < 5; i++) {

            int c = i + 1; // card counter

            if ((Collections.frequency(hand, "Joker")) < 2) { // checks if still jokers in deck

                int jokerCheck = (int) (Math.random() * (54 - hand.size())); // Struggled to implement this in driver :/
                                                                             // It's like the dealer has them in his pocket
                if (jokerCheck == 1) {                                       // And uses a random number guesser to see if he plays it
                    System.out.print(c + ". ");
                    System.out.println("Dealt card: Joker");              // Spaghetti solution
                    hand.add("Joker");
                } else if (jokerCheck != 1) {
                    Card card = new Card();
                    String newCard = card.Deck(card.suit, card.rank);
                    if (hand.contains(newCard) == true) {
                        i--;
                        continue;
                    } else {
                        System.out.print(c + ". ");
                        System.out.println("Dealt card: " + newCard);
                        hand.add(newCard);
                    }
                }
            } else { // if there are no jokers
                Card card = new Card();
                String newCard = card.Deck(card.suit, card.rank);
                if (hand.contains(newCard) == true) {
                    i--;
                    continue;
                } else {
                    System.out.print(c + ". ");
                    System.out.println("Dealt card: " + newCard);
                    hand.add(newCard);
                }
            }
        }
    }
}
