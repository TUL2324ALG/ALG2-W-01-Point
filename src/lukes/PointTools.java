package lukes;
public class PointTools {
    private PointTools(){
        //znemozni vytvareni objektu tridy PointTools
    }
       public static double distanceFrom(Point a, Point b){
       return Math.hypot(a.getX()-b.getX(), a.getY()-b.getY());
       //obecne nepouzivame static metody
   }
}
