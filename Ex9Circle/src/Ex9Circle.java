/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Joseph
 */
public class Ex9Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
    System.out.print("Enter radius: ");
    
    double radius = kb.nextDouble();
    
    double area = Math.PI * (radius * radius);
    System.out.println("The area of the circle is: " + area);
    
    double circumference = Math.PI * 2*radius;
    System.out.println("The circumference of the circle is: " + circumference);
 
    }
    
}
