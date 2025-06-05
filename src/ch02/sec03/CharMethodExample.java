package ch02.sec03;

public class CharMethodExample {
    public static void main(String[] args) {
        printCharToInt('c');
        printCharToInt('가');
        printCharToInt('!');

        int val = geCharToInt('c');
        System.out.println("val" + val);

    }
    public static int geCharToInt(char c) {
        return (int)c;
    }

    // return 메소드, void 메소드
    // 리턴타입, 메소드명, 파라미터, 구현부
    // static 없으면 빨간줄이 생긴다.
    public static void printCharToInt(char c) {
        System.out.printf("%c:%d\n", c, (int) c);

    }
}
