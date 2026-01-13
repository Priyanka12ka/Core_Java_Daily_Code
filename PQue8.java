/*Q10. Write a Java program to calculate the area of an equilateral triangle.
 Input : Side = 6
 Output : Area = 15.59
 */
import java.util.*;
public class PQue8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side: ");
        int side=sc.nextInt();
        System.out.println("Area of equilateral triangle: "+((Math.sqrt(3)/4)*side*side));
    }

}
