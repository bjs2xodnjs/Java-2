package statcraft;

public abstract class Unit {
    protected int x; // 좌표 x
    protected int y; // 좌표 y

    public abstract void move(int x, int y);
    protected void stop() {
        System.out.println("현재 위치에 정지한다.");
    }
}
