package pjatk;

public class MovablePoint implements Movable {
    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        this.y += this.ySpeed;
    }

    public void moveDown() {
        this.y -= this.ySpeed;
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    public void moveRight() {
        this.x += this.xSpeed;
    }

    public String toString() {
        return String.format("MovablePoint{x=%.2f, y=%.2f, xSpeed=%.2f, ySpeed=%.2f}", this.x, this.y, this.xSpeed,
                this.ySpeed);
    }
}
