package ch02.sec01.method;

public class VariableUseMethodExample {
    public static void main(String[] args) {
        printTime(10, 20); // 10:20
        printTime(2, 9); // 02:09

        printTime(2, 9, 2); //02:09:02
        printTime(12, 9, 22); // 12:09:22

    }

    public static void printTime(int hour, int min) {
        // System.out.printf("%02d:%02d\n", hour, min);
        String Hour = (hour < 10 ? "0" + hour:String.valueOf(hour));
        String Min = (min < 10 ? "0" + min:String.valueOf(min));
        System.out.println(Hour + ":" + Min);


    }
    public static void printTime(int hour, int min, int max) {
        String Hour = (hour < 10 ? "0" + hour:String.valueOf(hour));
        String Min = (min < 10 ? "0" +  min:String.valueOf(min));
        String Max = (max < 10 ? "0" + max:String.valueOf(max));
        System.out.println(Hour + ":" +Min + ":"  + Max);
    }


}
