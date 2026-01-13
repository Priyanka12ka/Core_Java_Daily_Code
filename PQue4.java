
/*Q4. Write a Java program to enter length and breadth of a rectangle and calculate its area.
 Formula: area = length × breadth
 */
import java.util.*;

public class PQue4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenghth :");
        int l = sc.nextInt();
        System.out.println("Enter lenghth :");
        int b = sc.nextInt();
        int area = l * b;
        System.out.println("Area :" + area);
    }

}
