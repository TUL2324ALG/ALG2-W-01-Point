/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macoun;

/**
 *
 * @author Macoun-V-e2a4
 */

// Nepoužívat v "template" třídách static metody!!!
// Všechny public metody by měly mít javadoc komentář

public class Point {
    // data, instancni promenne, fields - vlastnost
    private double x; //private ukryje implementaci před zbytkem kódu
    private double y;
    
    // konstruktor - v pameti alokuje misto, a pak ulozi ty data, ktera trida prebere
    // vytvari objekt v pameti a nastavuje instancni promenne
    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    // přetížení (overloading)
    Point() {
        this(0,0); //volani predchoziho konstruktoru
        //this.x = 0;
        //this.y = 0;
    }
    
    // Otázka - getter a setter - proč to je něco jiného, než public? Rozdíl je
    // v tom, že v public případě mi to človíček může nastavit na hloupost, díky
    // getteru a setteru (což jsou metody) můžu nastavit nějaké širší ošetření dat
    // zejména u toho setteru teda
    // u getteru pro změnu mohu vracet to, co chci
    
    // getter - k zobrazení
    double getX()
    {
        return x;
    }
    
    double getY()
    {
        return y;
    }
    
    public double getDistanceFromOrigin()
    {
        return distanceFromOrigin();
    }
    
    // setter - k nastavování
    void setX(double x)
    {
        if (x <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    private double distanceFromOrigin()
    {
        return Math.hypot(x,y);
    }
    /**
     * Calculates distance between two points
     * @param b
     * @return distance
     */
    public double distanceFrom(Point b)
    {
        return Math.hypot(x - b.x, y - b.y); // zelené x = this.x
    }
    
    // Třídy jsou dědici Objektu, který má nějaké předdefinované metody - např. toString()
    // mohu  je overridnout, taky stejný jako v c#
    @Override // anotace
    public String toString()
    {
        return "x = "+x+", "+"y = "+y;
    }
}