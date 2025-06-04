package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean korean = new Korean(); // 기본생성자

        System.out.println(korean.nation);// 대한민국
        System.out.println(korean.name);// 신사임당
        System.out.println(korean.ssn);// 901022-2754312

        Korean korean2 = new Korean/* 파라메터 호출*/("홍길동2", "901123-1543123");
        System.out.println(korean.nation);// 대한민국
        System.out.println(korean.name);// 홍길동2
        System.out.println(korean.ssn);// 901022-2754312

    }
}
