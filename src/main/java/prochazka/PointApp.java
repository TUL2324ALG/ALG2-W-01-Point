package prochazka;

public class PointApp {
	public static void main(String[] args) {
		Point point = new Point(1, 1);

		System.out.println(point.distanceFromOrigin());
		System.out.println(point.toString());
	}
}

