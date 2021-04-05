import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Point {
    private int x;
    private int y;

    public Point() {
        this.setCoordinates(320, 200);
    }

    public Point(int x, int y) {
        this.setCoordinates(x, y);
    }

    public Point(Point point) {
        this.setCoordinates(point);
    }

    public void setX(int number) {
        this.x = number;
    }

    public void setY(int number) {
        this.y = number;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point getCoordinates() {
        return this;
    }

    public void setCoordinates(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public void setCoordinates(Point point) {
        this.setCoordinates(point.getX(), point.getY());
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point point) {
        return this.distance(point.getX(), point.getY());
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}

class Segment {
    private Point point1;
    private Point point2;

    public Segment() {
        this.setPoints(new Point(), new Point());
    }

    public Segment(Point point1, Point point2) {
        this.setPoints(point1, point2);
    }

    public Segment(Segment segment) {
        this.setPoints(segment);
    }

    public void setPoint1(Point point) {
        this.point1 = point;
    }

    public void setPoint2(Point point) {
        this.point2 = point;
    }

    public Point getPoint1() {
        return this.point1;
    }

    public Point getPoint2() {
        return this.point2;
    }

    public void setPoints(Point point1, Point point2) {
        this.setPoint1(point1);
        this.setPoint2(point2);
    }

    public void setPoints(Segment segment) {
        this.setPoints(segment.getPoint1(), segment.getPoint2());
    }

    public double getLength() {
        return this.point1.distance(this.point2);
    }

    public String toString() {
        return String.format("Segment[v1=%s, v2=%s]", this.point1.toString(), this.point2.toString());
    }
}

class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        this.setPoints(new Point(), new Point(), new Point());
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.setPoints(point1, point2, point3);
    }

    public Triangle(Triangle triangle) {
        this.setPoints(triangle);
    }

    public void setPoint1(Point point) {
        this.point1 = point;
    }

    public void setPoint2(Point point) {
        this.point2 = point;
    }

    public void setPoint3(Point point) {
        this.point3 = point;
    }

    public Point getPoint1() {
        return this.point1;
    }

    public Point getPoint2() {
        return this.point2;
    }

    public Point getPoint3() {
        return this.point3;
    }

    public void setPoints(Point point1, Point point2, Point point3) {
        this.setPoint1(point1);
        this.setPoint2(point2);
        this.setPoint3(point3);
    }

    public void setPoints(Triangle triangle) {
        this.setPoints(triangle.getPoint1(), triangle.getPoint2(), triangle.getPoint3());
    }

    public double getDistances() {
        return this.point1.distance(point2) + this.point2.distance(point3) + this.point3.distance(point1);
    }

    public String toString() {
        return String.format("Triangle[v1=%s, v2=%s, v3=%s]", this.point1.toString(), this.point2.toString(),
                this.point3.toString());
    }

    public String getType() {
        ArrayList<Double> segmentsLengths = new ArrayList<>() {
            {
                add(new Segment(point1, point2).getLength());
                add(new Segment(point2, point3).getLength());
                add(new Segment(point1, point3).getLength());
            }
        };

        if (!(segmentsLengths.get(0) + segmentsLengths.get(1) > segmentsLengths.get(2)
                && segmentsLengths.get(0) + segmentsLengths.get(2) > segmentsLengths.get(1)
                && segmentsLengths.get(1) + segmentsLengths.get(2) > segmentsLengths.get(0))) {
            return "The triangle is invalid";
        }

        int duplicateLengthsCount = Collections.frequency(segmentsLengths, segmentsLengths.get(0));
        if (duplicateLengthsCount == 1) {
            duplicateLengthsCount = Collections.frequency(segmentsLengths, segmentsLengths.get(1));
        }

        String type = "scalene";
        if (duplicateLengthsCount >= 2) {
            if (duplicateLengthsCount == 3) {
                type = "equilateral";
            } else {
                type = "isosceles";
            }
        }

        return "The triangle is " + type;
    }
}

class PointSegmentTriangleTest {
    public static void main(String[] args) throws IOException {
        Segment testSegment = new Segment(new Point(0, 0), new Point(5, 5));
        Triangle testTriangle = new Triangle(new Point(0, 0), new Point(5, 0), new Point(0, 5));

        // toString, który powinien wyświetlić obiekt następująco:
        // "Triangle[v1=(x1,y1),v2=(x2,y2),v3=(x3,y3)]" oraz
        // Segment[v1=(x1,y1),v2=(x2,y2)]
        System.out.println(testTriangle.toString());
        System.out.println(testSegment.toString());

        // getDistances, który zwraca obwód tego trójkąta
        System.out.println(testTriangle.getDistances());

        // getLength, który zwraca długość odcinka
        System.out.println(testSegment.getLength());

        // getType, który zwraca czy trójkąt jest równoramienny, równoboczny czy
        // różnoboczny
        Triangle testInvalidTriangle = new Triangle(new Point(0, 0), new Point(0, 1), new Point(0, 2));
        Triangle testScaleneTriangle = new Triangle(new Point(0, 0), new Point(0, 1), new Point(2, 0));
        Triangle testIsoscelesTriangle = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
        System.out.println(testInvalidTriangle.getType());
        System.out.println(testScaleneTriangle.getType());
        System.out.println(testIsoscelesTriangle.getType());
        // trójkąt, którego współrzędne są liczbami całkowitymi ("Utwórz klasę o nazwie
        // Point, która będzie jako pole instancji posiadało dwie zmienne całkowite")
        // nie może być równoboczny:
        // https://liga.mat.umk.pl//rozw/rocznik91a/16_karn/05_06_g2_liga3_16r/05_06_g2_liga3_16r.html
    }
}