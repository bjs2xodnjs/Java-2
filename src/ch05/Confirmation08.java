package ch05;

public class Confirmation08 {
    public static void main(String[] args) {
        int [][] arr = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88},
        };
        int sum = 0;
        int coust = 0;
        for(int i=0; i < arr.length; i++ ) {
            for(int k=0; k < arr[i].length; k++ ) {
                sum += arr[i][k];
                coust++;
            }
        }
        double avg = (double) sum / coust;
        System.out.println("합계" + sum);
        System.out.println("합계" + avg);
        // 중첩for문 사용

        // 합계

        // 평균

        }
    }

