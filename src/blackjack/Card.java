package blackjack;

public class Card {
    // 무늬 pattern - Spade, Heart, Clover, Diamond
    // 값 denomination - A, 2, 3, 4, 5....9, 10, J, Q, K
    // 한 개의 데이터를 저장할 수 있도록 (캡슐화하기)

    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
    public String getPattern() {
        return pattern;
    }
    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString() {
        return String.format("%s (%s)", this.pattern, this.denomination);
    }
}
