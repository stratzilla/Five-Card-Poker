package Cards;

/**
 * Card class for Five-Card Poker.
 */
public class Card {

    private static final String[] SUITS = {"\u2660", "\u2665", "\u2666", "\u2663"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
         "J", "Q", "K", "A"};
    private final int cardNum; // the number of a card (1-52)

    /**
     * constructor for card class
     * @param c - card number (1-52 for standard 52-deck) initialize to
     */
    public Card(int c) {
        cardNum = c;
    }

    /**
     * method to get the rank of a card using modulo operators
     * @return the rank/face value of the card
     */
    public int getRank() {
        return cardNum % 13; // assuming 52-card deck, 13 of each suit
    }

    /**
     * method to get the suit of a card using modulo operators
     * @return the suit of the card
     */
    public int getSuit() {
        return cardNum % 4; // assuming 52-card deck, 4 of each rank
    }

    /**
     * method which uses the above two to work a sentence describing a card
     * @return a string which describes the card
     */
    public String getCard() {
        return RANKS[getRank()] + SUITS[getSuit()];
    }
}
