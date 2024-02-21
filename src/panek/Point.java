package panek;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }

    public double distanceFrom(Point point) {
        return Math.hypot(x - point.x, y - point.y);
    }

    @Override
    public String toString() {
        return "[" + x + " " + y + "]";
    }
}
