package ch04.sec04.method;

import ch02.sec11.ScoreMethodExample;

public class Misson03 {
    public static void main(String[] args) {
        int star = ScoreMethodExample.getRandomValue(3, 7); // 클래스 이름.메소드 호출이 됨 (클래스 메소드)
        System.out.println("star: " + star);

        //***** 5였다면 개행
        //*** 3였다면 개행
        // 콘솔에 출력

        printSingleLine(star);
        printSingleLine(10);
        printSingleLine(20);
        System.out.println("========================");

        printMulitLine(4);
        // ****
        // ****
        // ****
        // ****

        System.out.println();

        printMulitLine(6);
        // ******
        // ******
        // ******
        // ******
        // ******
        // ******
        // ******

        System.out.println();

        printTriangleLine(4);
        // *
        // **
        // ***
        // *****

    }
    public static void printTriangleLine(int star) {
        for (int i=1; i <= star; i++ ) {
            for(int j=1; j <= i; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printSingleLine(int star) {
        for(int i = 0; i < star; i++ ) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printMulitLine(int star) {
        for(int i = 0; i < star; i++) {
            for(int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
