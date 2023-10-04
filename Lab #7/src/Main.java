public class Main {

    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit < 3; suit++) {
            for (int value = 0; value < 13; value++) {
                cards[index] = new Card(value, suit);
                index++;
            }
        }
        return cards;



    }

    public static void main(String[] args) {
	// write your code here

        System.out.println();
    }
}
