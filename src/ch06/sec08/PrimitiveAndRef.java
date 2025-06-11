package ch06.sec08;

public class PrimitiveAndRef {
    public static void main(String[] args) {
        int num = 10;

        Numbox numbox = new Numbox(); // numbox만 객체 주소값을 넣을 수 있다.
        numbox.num = 10;
        changeNum(numbox);
        System.out.println("numbox.num: " + numbox.num); // ???

        changeNum(num);

        System.out.println("num: " + num);
    }
    public static void changeNum(int num) {
        num = 20;
    }
    public static void changeNum(Numbox numbox) {

        numbox.num = 20;
    }
}

class Numbox {
    int num;
}
