package blackjack;

public class CardDeck {

    private String[] patterns = {"Spade♠","Heart♥","Clover♣","Diamond♦"};
    private Card[] cards = new Card[52];  // cards는 카드객체 52개의 주소값을 저장한 친구한테 접근할 수 있다..
    private int selectedIdx = 0;

   // 기본 생성자 작성
    public CardDeck() {
        // 각 방은 어떤값만 들어갈 수 있는가? Card 객체주소값
        // 모든 방에 모두 다른 주소값을 넣는다.

        // 각 카드가 가지고 있는 값도 모두 달라야 한다.
        // 패턴은 Spade, Heart, Clover, Diamond
        // 디노미네이션 A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K
        // 13장 패턴은 모두 Spade
        // 13장 패턴은 모두 Heart



        String[] patterns = {"Spade","Heart","Clover","Diamond"};
        String[] denominations = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int index = 0;
        for (int i=0; i< patterns.length; i++) {
            for(int k=1; k<=13; k++) {
                String denomination = switch (k) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(k);
                };
                cards[index++] = new Card(patterns[i], denomination);
            }
        }
        shuffle();
    }
    public void printAllCards() {
        for(Card card : cards) {
            // System.out.printf("%s (%s)\n", card.getPattern(), card.getDenomination());
            System.out.println(card);
        }
    }
    @Override //에노테이션
    public String toString() {
        return "ㅋㅋㅋㅋ";
    }
    private void shuffle() {
        // 카드 객체 순서 섞어주세요.
        for(int i=0; i< cards.length; i++) {
            int k=(int)(Math.random() * (i + 1));

            Card temp = cards[i];
            cards[i] = cards[k];
            cards[k] = temp;
        }

    }
    public Card getCard() {
        if(selectedIdx == cards.length) {

        return null;
        }
        Card c = cards[selectedIdx];
        cards[selectedIdx++] = null;
        return c;
    }
}

