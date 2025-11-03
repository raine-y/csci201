import java.util.ArrayList;

public class Dealer {
    public static void main(String[] args) {
        ArrayList<String> hand = new ArrayList<>(); // prevents duplicates to mirror 54 card deck
        for (int i = 0; i < 5; i++) {
            int c = i + 1; // card counter
            System.out.print(c + ". ");
            int jokerCheck = (int) (Math.random() *  (54 - hand.size()));
            if (jokerCheck == 1) {
                System.out.println("Dealt card: Joker");
            } else if (jokerCheck != 1) {
                Card card = new Card();
                String newCard = card.Deck(card.suit, card.rank);
                if (hand.contains(newCard) == true) {
                    i--;
                    continue;
                } else {
                    System.out.println("Dealt card: " + newCard);
                    hand.add(newCard);
                }
            }
        }
    }
}