/*Q5. Write a Java program to enter the radius of a circle and calculate its diameter, area, and circumference. */
import java.util.*;
public class PQue5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius=sc.nextInt();
        double pi=3.15;
        System.out.println("Area: "+(pi*(radius*radius)));
        System.out.println("Circumference: "+(pi*radius));
        System.out.println("Diameter: "+(2*radius));
        
    }

}
