/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panek;

/**
 *
 * @author honzaap
 */
public class ALG2W01Point {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point bod1 = new Point(2, 4);
        System.out.println(bod1.distanceFromOrigin());
        Point bod2 = new Point(3, 0);
        System.out.println(bod1.distanceFrom(bod2));
    }
    
}
