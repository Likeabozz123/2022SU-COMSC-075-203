package QuestionThree;

import QuestionOne.Card;

public class QuestionThree {

    public static void main(String[] args) {

    }


    public static int hasFlush(Card[] cards) {

        if (cards.length !=5) {
            return 0;
        }
        if (cards[0].suit == cards[1].suit &&
                cards[0].suit == cards[2].suit &&
                cards[0].suit == cards[3].suit &&
                cards[0].suit == cards[4].suit) {
            return 1;
        }

        return 0;
    }

    public static boolean hasRoyal(Card[] cards) {
        if (hasFlush(cards) == 1) {
            for (int i = 0; i < cards.length; i++) {
                if (cards[i].value >= 2 && cards[i].value <= 9 ) {
                    return false;
                }
            }
        }
        return false;
    }

}
