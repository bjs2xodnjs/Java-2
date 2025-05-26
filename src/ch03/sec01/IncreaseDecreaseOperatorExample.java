package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // 1씩증가로 12가 출력됨
        ++x;
        System.out.println("x=" + x);
        System.out.println("------------------------");

        y--; // 2씩감소로 8이 출력됨
        --y;
        System.out.println("y=" + y);
        System.out.println("------------------------");

        z = x++; // 읽기 먼저 >> 쓰기로 z한테 준다.
        System.out.println("z=" + z); // z = 12
        System.out.println("x=" + x); // z = 13
        System.out.println("------------------------");

        z = ++x;
        System.out.println("2. z=" + z);
        System.out.println("2. x=" + x);
        System.out.println("------------------------");

        // x = 14, y = 8
        z = ++x + y++;
        System.out.println("3. z=" + z); // 23
        System.out.println("3. x=" + x); // 15
        System.out.println("3. y=" + y); // 9


    }
}
