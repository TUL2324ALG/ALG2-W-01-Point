package lukes;

public class Point {

    //data, instancni promenne, fields - vlastnost, stav, charakteristika
    private double x;
    private double y;
    private double distanceFromOrigin;

    //konstruktor, vytvari objekt, nastavuje instancni promenne
    Point(double x, double y) {
        this.x = x;
        this.y = y;
        distanceFromOrigin = distanceFromOrigin();
    }

    //pretizeni - overload konstruktor
    public Point() {
        this(0, 0);
        //this.x=0;
        //this.y=0;
    }

    private double distanceFromOrigin() {
        return Math.hypot(x, y);
    }

    /**
     * Calculates distance betweem this point and point called public double
     * distanceFrom(Point b){ return Math.hypot(this.x-b.x,this.y-b.y);
     */
    public double distanceFrom(Point b) {
        return Math.hypot(this.x - b.x, this.y - b.y);

    }

    //gettry
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    //settr
    public void setX(double x) {
        if (x <= 0) { //metoda umožňuje kontrolu
            throw new IllegalArgumentException();
        }
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    //public static double distanceFrom(Point a, Point b){
    //return Math.hypot(a.x-b.x, a.y-b.y);
    //obecne nepouzivame static metody
    //}

    @Override
    public String toString() {
        return "x= " + x + ",y= " + y;
    }
}
