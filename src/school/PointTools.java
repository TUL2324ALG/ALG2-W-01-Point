package school;

//knihovni trida
public final class PointTools {
    
    private PointTools(){ //znemozneni vytvareni objektu tridy PointTools
        
    }
    
    public static double distanceFrom(Point a, Point b){
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }
}
