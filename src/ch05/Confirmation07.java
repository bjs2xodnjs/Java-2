package ch05;

public class Confirmation07 {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};

        // for 문을 활용하여 max 값을 찾아 출력하세요.
        int max = array[0];
        for(int i=1; i< array.length; i++) {
            if(array[i] > max) {
                max= array[i];
            }
            System.out.println("max: " + max);
        }
    }
}
