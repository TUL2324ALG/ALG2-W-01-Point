package hruska;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x <= 0) { // kontrola
            throw new IllegalArgumentException();
        }
        this.x = x;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
        //this.x = 0;
        //this.y = 0;
    }

    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }

    public double distanceFrom(Point b) {
        return Math.hypot(this.x - b.x, this.y - b.y);
    }

    @Override
    public String toString() {
        return "x= " + x + "y= " + y;
    }
}
