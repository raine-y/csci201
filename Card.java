public class Card {
    public String suit;
    public String rank;
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

    public String Deck(String suit, String rank) {
        int suitIndex = (int) (Math.random() * suits.length);
        int rankIndex = (int) (Math.random() * ranks.length);
        this.suit = suits[suitIndex];
        this.rank = ranks[rankIndex];
        return this.rank + " of " + this.suit;
        // return "joker" + " ";
    }
}