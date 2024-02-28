/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package macoun;

/**
 *
 * @author Macoun-V-e2a4
 */
public class PointApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Point bod1 = new Point(-895, 4);
        System.out.println(bod1.getDistanceFromOrigin());
        Point bod2 = new Point(5, 6);
        
        System.out.println(bod1.distanceFrom(bod2));
        
        // System.out.println(bod1.x); //nejde kvůli private
        System.out.println(bod1.getX()); // getter
        System.out.println(bod1.toString());
        
        System.out.println(PointTools.distanceFrom(bod1, bod2));
    }
    
}
