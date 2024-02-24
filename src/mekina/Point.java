package mekina;


/**
 * 2D point
 *
 * @author Ondřej Mekina
 */
public class Point {

    // Class variables

    private double x;
    private double y;

    // Constructors

    public Point() {
        x = 0;
        y = 0;
    }

    /**
     * Create a point given two scalars representing the 2D position
     */
    public Point(double ix, double iy) {
        x = ix;
        y = iy;
    }

    // Setters and getters

    /**
     * @return Point's x coordinate scalar
     */
    public double getX() {
        return x;
    }

    /**
     * @return Point's y coordinate scalar
     */
    public double getY() {
        return y;
    }

    /**
     * @param ix New x coordinate scalar
     */
    public void setX(double ix) {
        x = ix;
    }

    /**
     * @param iy New y coordinate scalar
     */
    public void setY(double iy) {
        y = iy;
    }

    // Distance methods

    /**
     * Distance from the world origin (0, 0)
     */
    public double distanceFromOrigin() {
        return Math.hypot(x, y);
    }

    /**
     * Distance from another 2D Point
     * 
     * @param other Another point
     *
     * @return Scalar of distance
     */
    public double distanceFrom(Point other) {
        return Math.hypot(x - other.x, y - other.y);
    }

    // Utils

    @Override
    public String toString() {
        return "Point { " + String.valueOf(x) + ", " + String.valueOf(y) + " }";
    }
}
