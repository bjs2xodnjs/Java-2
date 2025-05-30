package ch05.sec11;

public class Misson01 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < args.length; i++) {
            num = Integer.parseInt(args[i]);

        }
        System.out.println("num: " + num);
    }
    }

