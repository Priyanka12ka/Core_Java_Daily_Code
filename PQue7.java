/*Q9. Write a Java program to enter two angles of a triangle and find the third angle.
 Input:
 Angle1 = 50
 Angle2 = 60
 Output : Third Angle = 70
 */
import java.util.*;
public class PQue7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two sides: ");
       int  A1=sc.nextInt();
       int  A2=sc.nextInt();
       int  A3=180-(A1+A2);
       System.out.println(A3);



    }
}
