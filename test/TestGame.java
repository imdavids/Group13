import ca.sheridancollege.project.Card;
import ca.sheridancollege.project.GroupOfCards;
//import ca.sheridancollege.project.Player;
import ca.sheridancollege.project.Card.Rank;
import ca.sheridancollege.project.Card.Suit;

/**
 *
 * @author Dell Percision 7520
 */
public class TestGame {
    public static void main(String[] args) {
        // Test the Card class
        testCard();

        // Test the GroupOfCards class
        testGroupOfCards();
    }
    
    private static void testCard() {
        Card card1 = new Card(Rank.ACE, Suit.HEARTS);
        Card card2 = new Card(Rank.SEVEN, Suit.CLUBS);

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
    }

    private static void testGroupOfCards() {
        GroupOfCards deck = new GroupOfCards(52);

        // Add some cards to the deck
        deck.addCard(new Card(Rank.ACE, Suit.HEARTS));
        deck.addCard(new Card(Rank.KING, Suit.SPADES));
        deck.addCard(new Card(Rank.FOUR, Suit.DIAMONDS));

        System.out.println("Deck size: " + deck.getSize());

        // Shuffle the deck
        deck.shuffle();

        // Print the shuffled deck
        System.out.println("Shuffled deck:");
        for (Card card : deck.getCards()) {
            System.out.println(card);
        }
    }
}
