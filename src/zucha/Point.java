package zucha;

public class Point {
    Point(double X, double Y) {
        this.x = X;
        this.y = Y;
    }
    double x;
    double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void setX(double X) {
        this.x = X;
    }

    void setY(double Y) {
        this.y = Y;
    }

    double distanceFromOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    double distanceFrom(Point p) {
        return Math.hypot(x - p.x, y-p.y);
    }
}