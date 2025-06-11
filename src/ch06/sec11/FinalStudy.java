package ch06.sec11;

import java.io.PrintStream;

public class FinalStudy {
    public static void main(String[] args) {
        final int NUM = 10; // final이 붙으면 상수가 된다. 한번 입력되고 나면 수정불가
        // num = 20;
        final int NUM_2;
        NUM_2 = 10;
        //num2 = 20;

        double d = Math.PI;

        PrintStream ps = System.out; // static 이라서 가능하다.
        ps.println();
        // System.out = null;
        System.out.println(); // . 객체라서

        FinalObject fo1 = new FinalObject(10);
        FinalObject fo2 = new FinalObject(20);

        fo1.myAge(); // immutable
        fo2.myAge();

    }
}
