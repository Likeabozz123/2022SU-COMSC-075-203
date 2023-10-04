package QuestionOne;

public class Card {

    public int suit;
    public int value;

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean compareSuits(Card card1, Card card2) {
        if (card1.suit > card2.suit) {
            return true;
        }
        return false;
    }

    public boolean compareValue(Card card1, Card card2) {
        if (card1.value > card2.value) {
            return true;
        }
        return false;
    }
}
