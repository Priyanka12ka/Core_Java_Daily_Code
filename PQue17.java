/*Q34. Write a Java program to check whether a number is positive, negative, or zero.
 Input : Number = -8
 Output : Negative
 */
import java.util.*;
public class PQue17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Negative");
        }
        else if(n==0)
        {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Positive");
        }
    }

}
