package pjatk;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        this.setWidth(side);
        this.setLength(side);
    }

    public double getSide() {
        return this.getWidth();
    }

    public String toString() {
        return String.format("Square{%s}", super.toString());
    }
}
