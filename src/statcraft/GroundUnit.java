package statcraft;

public  abstract class GroundUnit extends Unit {
    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
