package ch08.sec11.exam02;

public class Taxi implements Vehicle, Trunk {
    @Override
    public void run() {
        System.out.println("택시가 달린다.");

    }

    @Override
    public void stop() {
        System.out.println("택시가 멈춘다.");
    }

    @Override
    public void load(String str) {
        System.out.printf("택시가 %s를 싣는다.\n", str ); // printf 로
    }
}