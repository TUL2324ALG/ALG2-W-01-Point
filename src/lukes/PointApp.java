package lukes;

public class PointApp {

    public static void main(String[] args) {
        Point bod1 = new Point(2, 4);
        System.out.println(bod1.getDistanceFromOrigin());
        Point bod2 = new Point(5, 6);
        bod1.distanceFrom(bod2);
        bod2.distanceFrom(bod1);
        System.out.println(bod1.distanceFrom(bod2));
        System.out.println(bod2.distanceFrom(bod1));
        System.out.println(bod1);
        System.out.println(PointTools.distanceFrom(bod1, bod2));

    }
}
