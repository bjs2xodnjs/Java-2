package ch04.sec04;

public class Misson07 {
    public static void main(String[] args) {
        int[] scores = {90, 88, 100, 70, 60};
        /*
        어떤 학생이 받은 점수이다.
        평균점수를 구하라.
         */

        int sum = 0;
        int length = scores.length;
        for(int i=0; i < length; i++) {
            sum += scores[i];

        }

        double average = (double) sum / scores.length;
        System.out.println("평균 점수: " + average);

    }//
}
