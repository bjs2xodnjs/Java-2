package ch07.sec07.poly2;

public class Poly2Example {
    public static void main(String[] args) {
        // Buyer 객체화
        Buyer buyer = new Buyer();

        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());
        buyer.buy(new Tv());

        System.out.println("잔액: " + buyer.getMoney());
        System.out.println("잔액: " + buyer.getBonusPoint());
    }
}
