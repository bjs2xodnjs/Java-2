package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(); // 객체 생성 연산자
        Student s2 = new Student();

        s1.name = "홍길동";
        s2.name = "신사임당";

        s1.introduce();
        s2.introduce();
    }
}
