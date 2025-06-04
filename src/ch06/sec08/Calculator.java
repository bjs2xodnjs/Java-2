package ch06.sec08;

public class Calculator {
    int result; // 전역변수
    // void 메소드 (값을 주지 않는다.)
    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    public void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 리턴 메소드
    public int plus(int n1, int n2) {
        int result = n1 + n2; // 지역변수
        return result;
    }
}
