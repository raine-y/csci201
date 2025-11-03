import java.util.ArrayList;

public class Dealer {

    public static void main(String[] args) {
        ArrayList<String> hand = new ArrayList<>(); // prevents duplicates to mirror 54 card deck
        for (int i = 0; i < 5; i++) {
            boolean j = true;
            boolean jokerCheck = Joker(j);
            if (jokerCheck == true) {
                System.out.println("Dealt card: Joker");
            } else if (jokerCheck == false) {
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

    public static boolean Joker(boolean j) { // 3. Volume (v)
        int i = 0; // jokers pulled
        int d = 54;
        if (i < 2) {
            int jokerChance = (int) (Math.random() * d);
            if (jokerChance == 1) {
                i++;
                j = true;
                return j;
            } else {
                j = false;
                return j;
            }
        } else { // All jokers pulled
            j = false;
            return j;
        }
    }
}