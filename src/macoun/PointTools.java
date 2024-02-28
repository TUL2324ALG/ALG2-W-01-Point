/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macoun;

/**
 *
 * @author Macoun-V-e2a4
 */

//knihovní třída - klíčové slovo final - nemůže se z ní dědit
public final class PointTools {
    
    // finta - private konstruktor - znemožnění vytváření objektů třídy PointTools
    private PointTools()
    {
        
    }
    
    // static - nepracuje s daty objektu (this), nemají s nimi nic společného
    public static double distanceFrom(Point a, Point b)
    {
        return Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
    }
}
