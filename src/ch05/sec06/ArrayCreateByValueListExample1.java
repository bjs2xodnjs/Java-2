package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season[0]: " + season[0]);
        System.out.println("season[1]: " + season[1]);
        System.out.println("season[2]: " + season[2]);
        System.out.println("season[3]: " + season[3]);

        season[0] = "봄";
        System.out.println("season[0]: " + season[0]);

        int[] scores = { 83, 90, 87 };

        int sum = 0;
        for(int item : scores) {
            sum += item;

            double avg = (double) sum / scores.length;
            System.out.printf("avgrage: f\n", avg );




        }
        /*for(int i=0; i<3; i++) {
            sum += scores[i];
        }*/
        System.out.println("총합: " + sum);
    }

}
