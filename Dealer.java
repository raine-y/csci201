import java.util.ArrayList; 

public class Dealer {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Card card = new Card();
            ArrayList<String> hand = new ArrayList<>();
            String latestCard = card.Deck(card.suit, card.rank);
            hand.add(latestCard);
            if (latestCard.equals(hand) ) {
                i--;
                continue;
            } else {
                System.out.println("Dealt card: " + latestCard);
            }

        }
    }
}