package ch06.sec04;

public class Student { // 클래스 선언
    String name; // 멤버필드

    public Student() {
        System.out.println("기본 생성자 호출!");
    } // StudentExample 에서 객체 생성 연산자 호출
                        // s1 의 주소값이 담긴다.
    void introduce() {// 값을 이용해서 파라미터로 데이터를 가져온다.
        int num; // 지역변수
        System.out.printf("안녕 내 이름은 %s라고 해\n", this.name);
    }
}
