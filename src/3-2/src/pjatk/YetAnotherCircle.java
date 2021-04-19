package pjatk;

public class YetAnotherCircle extends Shape {
    private double radius = 1.0;

    public YetAnotherCircle() {
    }

    public YetAnotherCircle(double radius) {
        this.radius = radius;
    }

    public YetAnotherCircle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return String.format("Circle{%s radius=%.1f}", super.toString(), this.radius);
    }
}
