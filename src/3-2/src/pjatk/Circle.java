package pjatk;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public String toString() {
        return String.format("Circle[radius=%.1f, color='%s']", this.radius, this.color);
    }
}