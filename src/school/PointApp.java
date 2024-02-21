
package school;

public class PointApp {

    public static void main(String[] args) {
       Point bod1 = new Point(2, 4);
       System.out.println(bod1.getDistanceFromOrigin());
       Point bod2 = new Point(5,6);
       System.out.println(bod1.distanceFrom(bod2));
       //bod2.distanceFrom(bod1);
       //System.out.println(bod1.x);
        System.out.println(bod1.getX());
        System.out.println(bod1);
        
        System.out.println(PointTools.distanceFrom(bod1, bod2));
    }
    
}
