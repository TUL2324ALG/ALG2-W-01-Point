package prochazka;

public class Point {
	private double x, y; // Private je peklo. Fuj.

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	Point() {
		this(0, 0);
	}

	public double distanceFromOrigin() {
		return Math.hypot(this.x, this.y);
	}

	public double distanceFrom(Point point) {
		return Math.hypot(this.x - point.x, this.y - point.y);
	}

	public double getX() { return this.x; }
	public double getY() { return this.y; }
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }

	@Override
	public String toString() {
		return "[" + this.x + ", " + this.y + "]";
	}
}

