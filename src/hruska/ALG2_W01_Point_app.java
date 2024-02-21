package hruska;

public class ALG2_W01_Point_app {

    public static void main(String[] args) {
        Point bod1 = new Point(2, 4);
        System.out.println(bod1.distanceFromOrigin());
        Point bod2 = new Point(5, 6);
        System.out.println(bod1.distanceFrom(bod2));
        System.out.println(bod1.toString());
    }

}
