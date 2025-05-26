package ch03.sec01;

public class SingOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        System.out.println("x: " + x);
        x = -x;
        System.out.println("x:" + x);

        byte b = 100;
        int y = -b; // byte 는 쓰지말자!
        System.out.println("y:" + y);
    }
}
