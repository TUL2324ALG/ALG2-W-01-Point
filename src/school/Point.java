package school;

public class Point {
    //data, instancni promenne, fields - vlastnost, stav, charakteristika
    private double x;
    private double y;
    
    private double distanceFromOrigin;
    
    //konstruktor, vytvari objekt, nastavuje instancni promenne
    public Point(double x, double y){
        this.x = x;
        this.y = y;
        distanceFromOrigin = distanceFromOrigin();
    }
    
    //pretizeny - overloaded konstruktor
    public Point(){
        this(0,0); //volani predchoziho konstruktoru, musi byt na prvnim radku
        //this.x = 0;
        //this.y = 0;
    }
    
    //gettr
    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanceFromOrigin() {
        return distanceFromOrigin;
    }
    
    //settr
    public void setX(double x){
        if(x <=0){ //metoda umoznuje kontolu
            throw new IllegalArgumentException();
        }
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    private double distanceFromOrigin(){
        return Math.hypot(x, y);
    }
    /**
     * Calculates distance between this point and the given point
     * @param b given point
     * @return distance
     */
    public double distanceFrom(Point b){
        return Math.hypot(this.x-b.x, this.y-b.y);
    }
    
    /*public static double distanceFrom(Point a, Point b){
        return Math.hypot(a.x - b.x, a.y - b.y);
    }*/
    
    @Override
    public String toString(){
        return "x= " + x + ",y= " + y;
    }
}
