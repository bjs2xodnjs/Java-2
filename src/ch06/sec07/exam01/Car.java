package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    // 오버로딩 (Overloadung) 똑같은 이름으로 메소드를 여러개 만들 수 있다.
    // 조건은 파라미터가 타입의 순서와 갯수가 달라야 한다. (매개변수명은 상관없음)
    public Car() {}
    // 생성자는 여러개 만들 수 있다.
    public Car(String model, boolean start, int speed) {
        this.model = model;
        this.start = start;
        this.speed = speed;


    }
}
